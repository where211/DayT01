package com.mingchuang.Demo2;
/*
* 计算数组中元素的最值
*
* */
public class ArrayDemo5 {
    public static void main(String[] args) {
        //定义数组。int类型
        int[] arr={5,1,12,4,6,8,0,3};
        //定义变量，记录数组中的最大值，先赋值数组中的第一个元素
        int max=arr[0];
        int min=arr[0];
        //遍历数组，获取所有的元素，和变量max作比较
        for(int i=1;i<arr.length;i++){
            //变量max和数组中的每一个元素进行比较
            //如果max，小于数组的一个元素，就把这个元素赋值给max
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        //遍历完成，变量max，就是数组最大值
        System.out.println(max);
        System.out.println(min);
    }
}
