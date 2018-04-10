package com.outab.tiger.web.test.sort;

import org.apache.commons.lang3.ArrayUtils;

/**
 * @author: 周易(yi.zhou)
 * @date: 2018/3/19 上午10:08
 * @Description:
 */
public class QuickSortModel {
    public static void main(String[] args) {
        int[] ins = {12,23,3,123,5,123,789,20,567,1234,889,222,7777,1,8,9};
        quick_sort(ins,0,ins.length-1);
        System.out.println(ArrayUtils.toString(ins));

    }

    /**
     * 快速排序
     *
     * @param s
     * @param l
     * @param r
     */
    public static void quick_sort(int[] s, int l, int r)
    {
        if (l < r)
        {
            //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x){
                    // 从右向左找第一个小于x的数
                    j--;
                }
                if(i < j){
                    s[i++] = s[j];
                }

                while(i < j && s[i] < x){
                    // 从左向右找第一个大于等于x的数
                    i++;
                }
                if(i < j){
                    s[j--] = s[i];
                }
            }
            s[i] = x;
            // 递归调用
            quick_sort(s, l, i - 1);
            quick_sort(s, i + 1, r);
        }

    }


}
