package com.outab.tiger.web.test.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/12/20 下午3:24
 * @Description:
 */
public class AopMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/testaop.xml");
        TestBean test = applicationContext.getBean("test",TestBean.class);
        test.test();

    }
}
