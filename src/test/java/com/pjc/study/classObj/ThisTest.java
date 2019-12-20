package com.pjc.study.classObj;

import org.testng.annotations.Test;

/**
 * @program: javales
 * @description: 关于this的测试类
 * @author: pjc
 * @create: 2019-12-20 08:05
 **/
public class ThisTest {

    private Integer index;

    public ThisTest() {
    }

    public ThisTest(Integer index) {
        this.index = index;
    }

    public void println(String name){
//    public void println(ThisTest this(或者是obj),String name){
        System.out.println(this.index+name);
    }

    //，只能传一个可变参数,这是错的
//    public void println(String... names,int... nums){
    public void println(String... names){

        if(names==null){
            System.out.println("参数为null");
            return;
        }

        //相当于传入了一个数组，所以可以用length
        if(names.length == 0){
            System.out.println("长度为0");
            return;
        }


        for(int i =0;i<names.length;i++){
            System.out.println(String.format("**%s",names[i]));
        }
    }

    @Test
    public void test1(){
        ThisTest obj = new ThisTest();
        obj.println("张三");
        //机器编译会把对象自己放在第一位,所以在方法中可以用this代表这个对象自己
//        obj.println(obj,"张三");
    }

    @Test
    public void testPrin(){
        println();
        System.out.println("==================");
//        println(null);
        println("name");
        System.out.println("==================");
        println("q","w","e","r");
    }

}


