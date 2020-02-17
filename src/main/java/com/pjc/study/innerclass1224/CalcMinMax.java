package com.pjc.study.innerclass1224;

import java.util.Arrays;

/**
 * @program: javales
 * @description: 静态内部类（计算最大最小值）
 * @author: pjc
 * @create: 2020-02-12 15:54
 **/
public class CalcMinMax {

    public int[] calc(int... nums){
        int max = nums[0];
        int min = nums[0];

        for (int num : nums){
            if(max < num){
                max = num;
            }
            if(min > num){
                min = num;
            }
        }

        //返回一个数组
        return new int[]{min,max};
    }

    public static void main(String[] args) {
        int[] result = new CalcMinMax().calc(1,5,7,2,3,9);
        //数组
        System.out.println(Arrays.toString(result));
    }
}


