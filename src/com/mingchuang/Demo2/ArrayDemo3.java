package com.mingchuang.Demo2;
/*
* 数组的遍历：
*   将所有的数组元素，全部获取
*   依靠索引，规律从0开始，一直在自动增长1，到达length-1
*   循环来实现
*     for  知道循环次数，计数器的思想
*     while  不确定循环次数
* */
public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr={2,1,6,5,8,7,9};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
