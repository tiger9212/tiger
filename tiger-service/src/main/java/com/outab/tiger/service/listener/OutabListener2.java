package com.outab.tiger.service.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/9/20 上午11:37
 * @Description:
 */
@Service
public class OutabListener2 implements MessageListener {
    @Override
    public void onMessage(Message message) {
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("this is lister2"+message.toString());
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
    }
}
