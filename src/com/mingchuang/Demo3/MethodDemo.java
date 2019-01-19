package com.mingchuang.Demo3;

public class MethodDemo {
    public static void main(String[] args) {
        //在main方法中，调用方法
        double s=getArea(4.5,6.6);
        System.out.println("面积为"+s);
    }
    /*
    * 需求：计算一个长方体的面积
    * 定义方法解决这个要求
    * 分析方法定义过程
    *  1.明确方法计算后的结果的数据类型  double 定义格式对应的就是返回值类型
    *  2.方法在计算过程中，有没有未知的数据，长和宽。未知数据的数据类型 double
    *    未知数的变量，定义在方法的参数列表里
    * 访问修饰符 返回值类型 方法名(参数类型 参数名1,....){
             方法体
             return 返回值;
     }
    * */
    public static double getArea(double length,double width){
        //实现方法的功能主体
        //double area=length*width;
        return length*width;//面积返回调用者
    }
}
