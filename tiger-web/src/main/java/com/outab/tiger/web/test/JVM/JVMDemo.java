package com.outab.tiger.web.test.JVM;

import java.nio.ByteBuffer;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2018/4/4 上午9:28
 * @Description:
 */
public class JVMDemo {
    public static void main(String[] args) {
        ByteBuffer.allocateDirect(2);
    }
}
