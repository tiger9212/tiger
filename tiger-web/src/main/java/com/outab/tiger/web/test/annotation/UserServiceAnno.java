package com.outab.tiger.web.test.annotation;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/7/17 上午9:26
 * @Description:
 */
@UserSession(isLogin = true)
public class UserServiceAnno {
    @UserName( value = "zhouyi")
    public String userName;
    @UserAge(value = 21)
    public int age;
}
