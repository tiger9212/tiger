package com.outab.tiger.web.test.main;

import com.outab.tiger.api.UserService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/7/19 下午12:44
 * @Description:
 */
public class SpringDemoMain {
    public static void main(String[] args) throws InterruptedException {
//        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
//        reader.loadBeanDefinitions(new ClassPathResource("spring/test-bean.xml"));
//        UserService userService = factory.getBean("userService",UserService.class);
//        userService.login(null);
        Boolean s = null;
        if(s){
            System.out.println(1);
        }
    }
}
