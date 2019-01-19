package com.mingchuang.Demo;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int i = sc.nextInt();
        if (i >= 90 && i <= 100) {
            String s = "A";
            switch (s) {
                case "A":
                    System.out.println("A等");
                    break;
            }
        }else if(i>=80&&i<90){
            String s = "B";
            switch (s) {
                case "B":
                    System.out.println("B等");
                    break;
            }
        }else if(i>=70&&i<80){
            String s = "C";
            switch (s) {
                case "C":
                    System.out.println("C等");
                    break;
            }
        }else if(i>=60&&i<70){
            String s = "D";
            switch (s) {
                case "D":
                    System.out.println("D等");
                    break;
            }
        }*/
       /* Scanner sc=new Scanner(System.in);
        System.out.println("请输入你的工龄和基本工资");
        int i=sc.nextInt();
        int j=sc.nextInt();
        if(i>=10&&i<15){
            int a=j+5000;
            System.out.println("您目前工作了"+i+"年，基本工资为"+j+"元，应涨工资5000元，涨后工资"+a+"元");
        }else if(i>=5&&i<10){
            int a=j+2500;
            System.out.println("您目前工作了"+i+"年，基本工资为"+j+"元，应涨工资2500元，涨后工资"+a+"元");
        }else if(i>=3&&i<5){
            int a=j+1000;
            System.out.println("您目前工作了"+i+"年，基本工资为"+j+"元，应涨工资1000元，涨后工资"+a+"元");
        }else if(i>=1&&i<3){
            int a=j+500;
            System.out.println("您目前工作了"+i+"年，基本工资为"+j+"元，应涨工资500元，涨后工资"+a+"元");
        }else if(i>=0&&i<1){
            int a=j+200;
            System.out.println("您目前工作了"+i+"年，基本工资为"+j+"元，应涨工资200元，涨后工资"+a+"元");
        }*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();
        int[] arr = {a, b, c};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("按照从小到大排序后的顺序为：" );
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
*/
         /*int[] arr={1,3,5,7,2,6};
         for(int i=arr.length-1;i>=0 ;i--){
             System.out.println(arr[i]);
        }*/
         int sum=0;
        int[][] intArr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        for(int i=0;i<intArr.length;i++){
        for(int j=0;j<intArr[i].length;j++){
        sum=sum+intArr[i][j];
        }
        }
        System.out.println(sum);
        }
        }