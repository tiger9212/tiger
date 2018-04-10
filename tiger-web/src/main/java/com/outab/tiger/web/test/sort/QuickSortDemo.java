package com.outab.tiger.web.test.sort;


/**
 * @Author: 周易(yi.zhou)
 * @Date: 2018/3/19 下午4:25
 * @Description:
 */
public class QuickSortDemo {

    public static void main(String[] args) {
        int[] ins = {12,23,3,123,5,123,789,20,567,1234,889,222,7777,1,8,9};
    }

    public static void quickSort(int[] ins, int left,int right){
        //左边游标
        int i = left;
        //右边游标
        int j = right;
        //取最左边的值为标准值
        int num = ins[left];
        //确定右边游标的确定值
        while(i<j&&ins[j]>num){
            j--;
        }
        if(i<j){
            //如果这个时候i仍然小于j，则将j下的值放到i下面
            ins[i] = ins[j];
            //因为需要从i开始找比标准值大的数放到j下面，所以第一个i不用判断，直接++
            i++;
        }
    }

}
