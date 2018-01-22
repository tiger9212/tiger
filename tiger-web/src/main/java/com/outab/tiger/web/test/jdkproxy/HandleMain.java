package com.outab.tiger.web.test.jdkproxy;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2018/1/4 下午2:24
 * @Description:
 */
public class HandleMain {
    public static void main(String[] args) {
        MyInvocationHandler handler = new MyInvocationHandler(new HandleServiceImpl());
        HandleService handleService = (HandleService) handler.getProxy();
        handleService.doMethod();
    }
}
