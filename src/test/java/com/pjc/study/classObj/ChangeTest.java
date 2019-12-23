package com.pjc.study.classObj;

import org.testng.annotations.Test;

/**
 * @program: javales
 * @description: 测试类
 * @author: pjc
 * @create: 2019-12-18 11:47
 **/
public class ChangeTest {

    public void changeNums(int num){
        System.out.println("传入的参数为："+num);
        num =20;
        System.out.println("修改后参数为："+num);
    }
    public void changeNums(StringBuilder sb){
        System.out.println("传入的参数为："+sb);
        //修改了堆中地址的内容的值
        sb.append("--追加");
        System.out.println("修改后参数为："+sb);

        //让sb指向了堆中新的地址，所以其实是两个sb
        sb = new StringBuilder();
        sb.append("--这是方法内追加的内容");
        System.out.println(sb);
    }

    /*一个方法不能修改一个基本数据类型的参数，
        也不能修改引用类型参数的指向，但是却可以修改引用类型参数指向的对象的值*/
    @Test
    public void changeNumsTest(){
//        int num = 30;
//        changeNums(10);
//        System.out.println("这个方法内的num为："+ num);

        //sb在栈中，指向了堆中的地址
        StringBuilder sb = new StringBuilder();
        sb.append("这是一个字符串");
        changeNums(sb);
        System.out.println(String.format("***,%s,***",sb));
    }

}


