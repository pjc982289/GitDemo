package com.pjc.study.array1212;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TargetNums {


    public static int[] targerNums(int target){
        int []nums ={4,5,7,1,2,6,9,8,11,13};
        Arrays.sort(nums);
//        System.out.println("排序后："+ Arrays.toString(nums));
        int count = 0;
        for (int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                count++;
//                System.out.println("当前是："+count+"****"+"和为"+(nums[i]+nums[j]));
                if(nums[i]+nums[j] >target){
                   continue;
                }
                if(nums[i]+nums[j] == target){
                    System.out.println("循环了"+count+"次");
                    return  new int[]{nums[i],nums[j]};
                }
            }
        }
        return null;
    }



}
