package com.mingchuang.Demo2;
/*
* 数组操作中，常见的两个异常
*   数组的索引越界异常
*    空指针异常
* */
public class ArrayDemo4 {
    public static void main(String[] args) {
        //空指针异常
        int[] arr={1,5,8};
        System.out.println(arr);
        System.out.println(arr[2]);
        arr=null;//地址清掉，arr不在保存数组的地址
        System.out.println(arr);
        System.out.println(arr[2]);
        /*
        * java.lang.NullPointerException
        * 空指针异常
        * */
    }
}
