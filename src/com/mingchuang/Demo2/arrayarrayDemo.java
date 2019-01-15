package com.mingchuang.Demo2;
/*
* 二维数组
*    数组中数组，数组里面存储的还是数组
*    定义方式和一维数组很相似
*    int[][] arrs=new int[一维数组的个数][每个一维数组元素的个数]
* */
public class arrayarrayDemo {
    public static void main(String[] args) {
        int[][] arrs=new int[3][4];
        System.out.println(arrs);
        System.out.println(arrs[0]);
        System.out.println(arrs[0][1]);
    }
}
