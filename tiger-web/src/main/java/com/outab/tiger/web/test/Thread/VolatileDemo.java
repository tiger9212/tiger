package com.outab.tiger.web.test.Thread;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2018/3/26 下午5:10
 * @Description:
 */
public class VolatileDemo {
    public static volatile int i = 100;
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                i++;
                System.out.println("t1:"+i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("t1:"+i);
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                System.out.println("t2:"+i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
                System.out.println("t2:"+i);
            }
        };
        t.start();
        t2.start();
    }
}
