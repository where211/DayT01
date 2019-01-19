package com.mingchuang.Demo2;
/*
* 二维数组的遍历求和
* 第一个小组销售额为{11,12}万元
* 第二个小组销售额为{21,22,23}万元
* 第三个小组销售额为{31,32,33,34}万元
* 每个小组就是一个数组，三个数组存储到一个数组中，形成二维数组
* 求和：
*   每个小组求和
*   所有元素求和
* */
public class ArrayArrayDemo4 {
    public static void main(String[] args) {
        int sum=0;//每个小组的和
        int sum1=0;//所有元素的和
        int[][] arr={{11,12},{21,22,23},{31,32,33,34}};
        //定义变量，保存两个求和的值
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++) {
                sum = sum + arr[i][j];//将每一个一维数组求和
               // sum1 = sum1 + arr[i][j];
            }
            System.out.println("第"+(i+1)+"个小组="+sum);
            sum1+=sum;
            sum=0;//每个小组求和清空
        }
        System.out.println("所有元素和="+sum1);
    }
}
