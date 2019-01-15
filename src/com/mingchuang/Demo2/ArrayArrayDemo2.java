package com.mingchuang.Demo2;
/*
* int[][] arr=new int[3][];
* 表示二维数组中定义了三个一维数组，但每个一维数组长度，没有指定
* */
public class ArrayArrayDemo2 {
    public static void main(String[] args) {
        /*int[][] arr=new int[3][];//不设置数组长度，没有地址
        arr[0]=new int[2];//设置数组长度，有地址
        System.out.println(arr);
        System.out.println(arr[0]);*/

        int[][] arr= new int[][]{{1,2},{3,4}};
        int[][] arr1={{5,6},{7,8}};
        System.out.println(arr);
        System.out.println(arr[0][0]);
        System.out.println(arr1[0][1]);


    }


    }

