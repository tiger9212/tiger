package com.outab.tiger.web.test.Thread;

import java.util.Vector;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2018/3/23 下午2:35
 * @Description:
 */
public class SynchronizedDemo {
    static {
        System.out.println("there are static");
    }
    {
        System.out.println("this is no static words");
    }
    public synchronized void getStr(){

    }
    public  void tes1t(){
        synchronized (this){

        }
    }
    public void test2(){
        Vector<String> vector = new Vector<String>();
        for(int i = 0 ; i < 10 ; i++){
            vector.add(i + "");
        }

        System.out.println(vector);
    }


    public static void main(String[] args) {
        SynchronizedDemo demo = new SynchronizedDemo();
        SynchronizedDemo demo2 = new SynchronizedDemo();
        demo2.test2();
    }

}
