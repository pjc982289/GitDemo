package com.pjc.study.innerclass1224;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: javales
 * @description: 双括号
 * @author: pjc
 * @create: 2020-02-12 15:40
 **/
public class DoubleInit {

    public static void main(String[] args) {
        //正常情况
        List<String> nums = new ArrayList<>();
        nums.add("1");
        nums.add("2");
        nums.add("3");
        System.out.println(nums);

        //匿名内部类模板
        new ArrayList(){
            //初始化代码块
            {

            }
        };

        //双括号初始化(实际上是匿名内部类里面定义了一个初始化代码块)
        List<Integer> numbs = new ArrayList(){
            private String name;
            {
                add(1);
                add(2);
            }
        };
        System.out.println(numbs);


    }
}


