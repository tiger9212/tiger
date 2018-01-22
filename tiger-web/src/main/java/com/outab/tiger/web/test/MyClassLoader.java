package com.outab.tiger.web.test;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/7/16 下午10:35
 * @Description:
 */
public class MyClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        throw new ClassNotFoundException(name);
    }
}
