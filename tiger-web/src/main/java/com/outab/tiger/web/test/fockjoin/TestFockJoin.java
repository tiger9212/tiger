package com.outab.tiger.web.test.fockjoin;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/7/31 下午3:30
 * @Description:
 */
public class TestFockJoin {
    //    public static void main(String[] args) {
//        ForkJoinPool pool = new ForkJoinPool();
//        List<String> list = new ArrayList();
//        for(int i = 0;i<30;i++){
//            list.add(i+"");
//        }
//        TaskTest testTask = new TaskTest(30);
//        ForkJoinTask<String> str = pool.submit(testTask);
//        System.out.println(1);
//    }
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
    }
}
