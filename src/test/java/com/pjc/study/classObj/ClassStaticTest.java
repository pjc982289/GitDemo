package com.pjc.study.classObj;

/**
 * @program: javales
 * @description: static和final修饰符
 * @author: pjc
 * @create: 2019-12-20 09:43
 **/
public class ClassStaticTest {

    //每new一个对象就会执行一次
    {
            System.out.println("这是一个普通的代码块");
    }

    //在类被加载时就执行，只执行一次
    static {
            System.out.println("这是一个静态代码块");
    }

    public static void main(String[] args) {
        for (int i =0;i<10;i++){
            ClassStaticTest cst = new ClassStaticTest();
            System.out.println("=======================");
        }

    }
}


