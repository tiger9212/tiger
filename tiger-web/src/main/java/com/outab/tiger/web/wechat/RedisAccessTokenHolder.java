
package com.outab.tiger.web.wechat;

import com.riversoft.weixin.common.AccessToken;
import com.riversoft.weixin.common.AccessTokenHolder;
import com.riversoft.weixin.common.WxClient;
import com.riversoft.weixin.mp.MpWxClientFactory;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @author wangxiaolong
 * @since 2017/10/11.
 */
@Component
public class RedisAccessTokenHolder extends AccessTokenHolder {
    private static final String ACCESS_TOKEN_KEY = "parking:access_token:";
    @Resource(name = "redisTemplate")
    private RedisTemplate redisTemplate;
    private static RedisAccessTokenHolder instance = new RedisAccessTokenHolder();
    private String clientId;

    public RedisAccessTokenHolder() {
        super(null, null, null);
    }

    @PostConstruct
    public void init() {
        WxClient client = MpWxClientFactory.getInstance().defaultWxClient();
        try {
            AccessTokenHolder oldAccessTokenHolder = (AccessTokenHolder) FieldUtils.readDeclaredField(client, "accessTokenHolder", true);
            String clientId = (String) FieldUtils.readField(oldAccessTokenHolder, "clientId", true);
            String clientSecret = (String) FieldUtils.readField(oldAccessTokenHolder, "clientSecret", true);
            String tokenUrl = (String) FieldUtils.readField(oldAccessTokenHolder, "tokenUrl", true);
            setClientId(clientId);
            setClientSecret(clientSecret);
            setTokenUrl(tokenUrl);
            FieldUtils.writeField(client, "accessTokenHolder", this, true);
        } catch (Exception e) {
            throw new RuntimeException("微信配置错误", e);
        }
    }

    @Override
    public void setClientId(String clientId) {
        super.setClientId(clientId);
        this.clientId = clientId;
    }

    @Override
    public AccessToken getAccessToken() {
        AccessToken accessToken = getCachedAccessToken();
        if (accessToken == null || accessToken.expired()) {
            refreshToken();
            return getCachedAccessToken();
        }
        return accessToken;
    }

    private AccessToken getCachedAccessToken() {
        String accessTokenStr = (String) redisTemplate.opsForValue().get(getAccessTokenKey());
        if (StringUtils.isBlank(accessTokenStr)) {
            return null;
        }
        return AccessToken.fromJson(accessTokenStr);
    }

    @Override
    public void refreshToken() {
        String content = fetchAccessToken();
        redisTemplate.opsForValue().set(getAccessTokenKey(), content, 7200, TimeUnit.SECONDS);
    }

    @Override
    public void expireToken() {
        redisTemplate.delete(getAccessTokenKey());
    }

    private String getAccessTokenKey() {
        return ACCESS_TOKEN_KEY + clientId;
    }

    public static RedisAccessTokenHolder getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
    }
}
