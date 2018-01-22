package com.outab.tiger.web.test.fockjoin;

import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * @Author: 周易(yi.zhou)
 * @Date: 2017/7/31 下午4:37
 * @Description:
 */
public class TaskTest extends RecursiveTask<String> {
    private int start;
    private int end;
    private List<String> list;
    private static int DEFAULT = 10;
    public TaskTest(int start){
        this.start = start;
    }
    @Override
    protected String compute() {
        System.out.println("in");

       if(start<=DEFAULT){
           System.out.println("this is start:"+start);
            return "this is start:"+start;
       }else{
           int bal = start/2;
           TaskTest task1 = new TaskTest(bal);
           TaskTest task2 = new TaskTest(bal);
           task1.fork();
           task2.fork();
           String str1 = task1.join();
           String str2 = task2.join();
          return str1+str2;
       }
    }
}
