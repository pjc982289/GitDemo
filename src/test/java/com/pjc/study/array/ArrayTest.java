package com.pjc.study.array;

import org.testng.annotations.Test;

import java.util.ArrayList;
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

        System.out.println("**********************");
        List<Integer> integers = new ArrayList<>();
        integers.add(arr[0]);
        integers.add(arr[1]);
        integers.add(arr[2]);

        int i =0;
        integers.forEach(val ->{
            val += arr[i];
            System.out.println(val);
        });
    }

    @Test
    public void testCopy(){
        Integer [] arr1 = {1,2,3,4,5,6,7};
        Integer [] arr2 = {6,7,8,9,10};

        //copyOf拷贝，第二个参数表示拷贝几位
        Integer [] arr3 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr3));
//        arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println(Arrays.toString(arr2));

        //copyOfRange,范围拷贝，前闭后开
        Integer []arr4 = Arrays.copyOfRange(arr1,2,arr1.length);
        System.out.println(Arrays.toString(arr4));

        /*把arr2的后三位拷贝到arr1的后三位，使arr1变成 {1,2,8,9,10}
        * 拷贝数组；从什么位置开始拷贝；目标数组；目标的起始位置；要拷贝的长度，和前面取出来的长度要一样否则报错（只能取3个数，length给的4）*/
//        System.arraycopy(arr2,arr2.length-3,arr1,0,4);
        System.arraycopy(arr2,arr2.length-3,arr1,0,3);
        System.out.println(Arrays.toString(arr1));
    }
}
