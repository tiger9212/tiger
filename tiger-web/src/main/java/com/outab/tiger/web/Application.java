package com.outab.tiger.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/7/16 下午4:27
 * @Description:
 */
@SpringBootApplication
@ImportResource({ "classpath:spring/applicationContext-*.xml" })
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
