package com.outab.tiger.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.outab.tiger.api.UserService;
import com.outab.tiger.api.modules.User;
import com.outab.tiger.web.service.HttpRequestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/7/16 下午4:17
 * @Description:
 */
@Controller
@RequestMapping(value = "/tiger/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @ResponseBody
    public String login(String wechatOpenId) {
        User user = new User();
        boolean isSuccess = userService.addUser(user);
        System.out.println(isSuccess);
        return "success";
    }

    @RequestMapping(value = "/getJsapiTicket")
    @ResponseBody
    private String getJsapiTicket() {
        String requestUrl = "https://api.weixin.qq.com/cgi-bin/token?";
        String params = "grant_type=client_credential&appid=" + "wx2cc109f2d6113abb" + "&secret=" + "6f05f0c92fccbbf19983ffd8120f33b0" + "";
        String result = HttpRequestUtils.httpGet(requestUrl + params);
        String access_token = JSONObject.parseObject(result).getString("access_token");
        requestUrl = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?";
        params = "access_token=" + access_token + "&type=jsapi";
        result = HttpRequestUtils.httpGet(requestUrl + params);
        String jsapi_ticket = JSONObject.parseObject(result).getString("ticket");
        int activeTime = Integer.parseInt(JSONObject.parseObject(result).getString("expires_in"));
        return jsapi_ticket;
    }

    @RequestMapping(value = "/getUserInfo")
    @ResponseBody
    public User getUserInfo(User user) {
        System.out.println(user);
        return user;
    }
}
