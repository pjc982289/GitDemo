package com.zeroten.flow;


import org.testng.annotations.Test;

public class BlockScope {

    @Test
    public void testBlockScope(){
        int n1 =100;
        System.out.println(n1);

        //代码块
        {
//            int n1 =20;   前面定义了n1，在代码块中不能同名定义
            //n2的作用域是代码块中
            int n2 = 200;

            {
                //200 可以输出
                System.out.println(n2);
            }
        }

        //可以和代码块中定义相同的名字。
        int n2 = 201;
        //输出为201，输出的上面这个n2，而不是代码块中的n2
        System.out.println(n2);

    }
}
