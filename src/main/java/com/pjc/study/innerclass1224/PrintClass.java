package com.pjc.study.innerclass1224;

/**
 * @program: javales
 * @description: 类
 * @author: pjc
 * @create: 2020-02-11 17:25
 **/
public class PrintClass {
    protected String name;

    public PrintClass() {
    }

    public PrintClass(String name) {
        this.name = name;
    }

    public void print(){
        System.out.println(name+"我是打印");
    }
}


