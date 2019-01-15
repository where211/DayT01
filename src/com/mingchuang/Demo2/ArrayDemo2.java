package com.mingchuang.Demo2;
/*
* 数组的两个定义方式
*   数据类型[] 变量名=new 数据类型[]{元素1，元素2，元素3，。。。};
*   注意事项：new后面的中括号，不逊于写任何内容，写了就编译失败
*
*    数据类型[] 变量名={元素1，元素2，....};
* */
public class ArrayDemo2 {
    public static void main(String[] args) {
        //定义数组的同时，对元素进行赋值
        int[] arr=new int[]{1,2,4,7,9};
        System.out.println(arr);
        arr=new int[]{1,2,4,7,9,10};//改变个数，换了一个地址
        System.out.println(arr);
        System.out.println(arr.length);
        //定义数组，直接大括号赋值
        int[] arr2={0,2,4,6,8};
        System.out.println(arr2.length);
        System.out.println(arr2[0]);//数组中第一位元素
        System.out.println(arr2[arr2.length-1]);//最后一位
    }
}
