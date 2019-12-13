package com.pjc.study.array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

    @Test
    public void arrayTest(){
        int [] a = {};
        //new创建会给初始值；基本类型为二进制的0，引用类型初始值为null
        int [] b = new int[3];

        int [] c = new int[]{};

        System.out.println(b);
        System.out.println(Arrays.toString(b));
    }

    @Test
    public void test2(){
        Integer [] arr = {1,2,3,4,5,6,6,7,8,9,10};

        Arrays.asList(arr).forEach(val ->{
            if(val %2==0){
                System.out.println(val+"为偶数");
            }else {
                String str = val +"**";
                System.out.println("不是偶数："+str);
            }
        });
    }
}
