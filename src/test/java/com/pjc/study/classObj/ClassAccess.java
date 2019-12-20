package com.pjc.study.classObj;

/**
 * @program: javales
 * @description: 四种修饰符的范围
 * @author: pjc
 * @create: 2019-12-20 08:43
 **/
public class ClassAccess {
    //所有
    public int index;

    //只能用于方法和变量；适用于当前类、同包、子类
    protected int index2;

    //类、接口、方法、变量；适用于当前类和同包
    int index3;

    //方法和变量；适用于当前类中
    private int num;
}


