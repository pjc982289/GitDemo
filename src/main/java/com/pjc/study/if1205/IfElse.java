package com.pjc.study.if1205;

import java.util.Scanner;


/**
 * 作业
 * @author pjc
 */
public class IfElse {

    public static void main(String[] args) {
        System.out.println("请输入你的年龄");
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        if(age>0 && age<=6){
            System.out.println("是儿童");
        }else if(age>6 && age<=17){
            System.out.println("少年");
        }else if(age>17 && age<=40){
            System.out.println("青年");
        }else if(age>40 && age<=59){
            System.out.println("中年");
        }else if(age>59){
            System.out.println("老年");
        }else {
            System.out.println("请输入正确的年龄");
        }


    }
}
