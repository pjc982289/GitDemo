package com.pjc.study.array1212.utils;

/**
 * @program: javales
 * @description: 对数组进行排序
 * @author: pjc
 * @create: 2019-12-17 08:58
 **/
public class SortNums {

    /**
     *@description:对数组进行从小到大的排序
     * @Param: [arr]
     * @return: int[]
     * @author: pjc
     * @date: 2019-12-17
     */
    public static int[] sortNums(int[] arr){

        for (int i = 0;i<arr.length-1;i++){
            for (int j =i+1;j<arr.length;j++){
                int temp;
                if(arr[i] > arr[j]){
                   temp =arr[i];
                   arr[i] = arr[j];
                   arr[j]=temp;
                }
            }

        }

        return arr;
    }
}


