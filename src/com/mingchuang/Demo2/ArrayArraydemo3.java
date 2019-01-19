package com.mingchuang.Demo2;
/*
* 二维数组的遍历
*    二维数组中，存储4个一维数组，每个一维数组的长度不同
*    遍历：外层for循环 遍历二维数组
*          内层for循环 遍历一维数组
* */
public class ArrayArraydemo3 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5},{6,7,8,9},{0}};
        //二维数组的长度
        System.out.println(arr.length);
        //第一个一维数组的长度
        System.out.println(arr[0].length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
