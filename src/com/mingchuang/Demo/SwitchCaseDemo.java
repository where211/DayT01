package com.mingchuang.Demo;

import java.util.Scanner;

/*
* switch 语句结构
* switch只能针对某个表达式的值做出判断，从而决定程序执行哪一段代码
*   switch(表达式）{
*      case 常量1:
*         要执行的语句；
*         break；
*       case 常量2:
 *         要执行的语句；
 *         break；
 *      case 常量3:
 *         要执行的语句；
 *         break；
 *         .......
 *       default:
 *         要执行的语句；
 *         break；
 *         }
 *     执行流程：
 *     表达式和case后面常量进行比较，和哪个case后的常量相同，就执行
 *     哪个case后面的程序，遇到break，就全结束
* */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        /*
        * 键盘录入月份，输出相应的季节
        * 3,4,5是春季
        * 6,7,8是夏季
        * 9,10,11是秋季
        * 12,1,2是冬季
        * 合理运用case击穿
        *
        * */
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份");
        int yuefen=sc.nextInt();
        switch(yuefen){
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }

    public static void function_2() {
        //看程序写结果
        int x=2;
        int y=3;
        switch(x) {
            default:
                y++;//没有break，刺穿，执行case 3
            case 3://先执行case，在default
                y++;
                break;
            case 4:
                y++;

        }
    }

    public static void function_1() {
        int week=4;
        /*
        * switch语句中的表达式的数据类型，是有要求
        * jdk1.0-1,4数据类型接受 byte short int char
        * jdk1.5  多了一个枚举（enum）
        * jdk1.7 多了一个String
        * 我们现在用的是jdk1.8
        * */
        switch (week){
            case 1://case后面的值，要唯一，且是定值，数据类型与switch后面表达式的结果数据类型一致
                System.out.println("礼拜一");
                break;//如果没有break，会造成case击穿，一直向下穿透
            case 2:
                System.out.println("礼拜二");
                break;
            case 3:
                System.out.println("礼拜三");
                break;
            case 4:
                System.out.println("礼拜四");
                break;
            case 5:
                System.out.println("礼拜五");
                break;
            case 6:
                System.out.println("礼拜六");
                break;
            case 7:
                System.out.println("礼拜天");
                break;
            default://default不是必须的，case都不满足，default是最后执行
                System.out.println("日期有误！");
                break ;//此处的break可写可不写
        }



    }
}
