package com.outab.tiger.web.service;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URLDecoder;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2018/1/3 下午3:59
 * @Description:
 */
public class HttpRequestUtils {


    /**
     * post请求
     * @param url         url地址
     * @return
     */
    public static String httpPost(String url){
        //post请求返回结果
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost method = new HttpPost(url);
        String str = "";
        try {
            HttpResponse result = httpClient.execute(method);
            url = URLDecoder.decode(url, "UTF-8");
            /**请求发送成功，并得到响应**/
            if (result.getStatusLine().getStatusCode() == 200) {
                try {
                    /**读取服务器返回过来的json字符串数据**/
                    str = EntityUtils.toString(result.getEntity());
                } catch (Exception e) {
                }
            }
        } catch (IOException e) {
        }
        return str;
    }


    /**
     * 发送get请求
     * @param url    路径
     * @return
     */
    public static String httpGet(String url){
        //get请求返回结果
        String strResult = null;
        try {
            DefaultHttpClient client = new DefaultHttpClient();
            //发送get请求
            HttpGet request = new HttpGet(url);
            HttpResponse response = client.execute(request);

            /**请求发送成功，并得到响应**/
            if (response.getStatusLine().getStatusCode() == org.apache.http.HttpStatus.SC_OK) {
                /**读取服务器返回过来的json字符串数据**/
                strResult = EntityUtils.toString(response.getEntity());
            } else {
            }
        } catch (IOException e) {
        }
        return strResult;
    }
}
