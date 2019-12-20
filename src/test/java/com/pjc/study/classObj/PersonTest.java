package com.pjc.study.classObj;

/**
 * @program: javales
 * @description: 测试类
 * @author: pjc
 * @create: 2019-12-18 08:14
 **/
public class PersonTest {

    public  static int num = 0;

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("*************"+p);
        Person p2 = new Person("pjc",18,"男");

        System.out.println(p2);
        PersonTest pt = new PersonTest();


    }
}


