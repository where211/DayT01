package com.mingchuang.Demo2;
/*
*
* */
public class ArrayDemo {
    public static void main(String[] args) {
        //定义数组，存储整数，容器长度3个
        int[] arr=new int[3];//int默认是0.String默认是nun
        System.out.println(arr);//arr是地址
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr.length);
        //赋值arr[1]
        arr[1]=5;
        System.out.println(arr[1]);
        System.out.println(arr[3]);
        /*
        * java.lang.ArrayIndexOutOfBoundsException: 3
        * 数组下标越界异常
        * */
    }
}
