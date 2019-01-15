package com.mingchuang.Demo;
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
        function_1();
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
