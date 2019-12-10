package com.pjc.decide1205;

import org.testng.annotations.Test;

import java.util.Random;
import java.util.Scanner;

public class IfElseTest {

    @Test
    public void testIfElse() {
//        System.out.println("请输入你的年龄");
//        Scanner scn = new Scanner(System.in);
//        int age = scn.nextInt();

        int age =18;

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

    @Test
    public void whileTest(){
        int count=0;

        END:
        while (true){
            int num = new Random().nextInt(100);

            if(num%3 ==0){
                System.out.println(num+" 能被3整除");
                count++;
                break END;
            }else {
                System.out.println(num + " 不能被3整除");
                count++;
            }
        }
        System.out.println("一共差生了" + count +"个数");
    }

    @Test
    public void forTest(){
        int count = 0;
        for (int i=0;i<=100;i++){
            if(i%2 != 0){
                System.out.print(i+"    ");
                count++;
            }
        }
        System.out.println();
        System.out.println("100以内一共有"+ count +"个单数");
    }

    @Test
    public void switchTest(){

        //switch中为正数，java5以后可以用枚举（Enum），java7以后可以用String
        int num = 3;

        switch (num){
            case 1:
                System.out.println("扫地");
                break;
            case 2:
                System.out.println("开灯");
                break;
            case 3:
                System.out.println("关灯");
                break;
            case 4:
                System.out.println("播放音乐");
                break;
            case 5:
                System.out.println("关闭音乐");
                break;
            default:
                System.out.println("不能识别指令");
                break;
        }
    }

    public int getMaxNUmber(int n1,int n2){
        for (int i = n2;i>0;i--){
            if(i%n1 == 7){
                return i;
            }
        }

        return -1;
    }

    @Test
    public void testReturn(){
        int result = getMaxNUmber(9,20);
        System.out.println("符合条件的数为："+result);
    }
}
