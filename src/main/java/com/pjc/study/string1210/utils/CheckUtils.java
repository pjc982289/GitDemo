package com.pjc.study.string1210.utils;

import java.util.List;

public class CheckUtils {


    /*可以认为是String[] strings,
    如果strings中有任意一个字符串为空，返回false，否则返回true*/
    public static boolean isAnyEmpty(String... strings){
        for (int i = 0;i<strings.length;i++){
            if(strings[i] == null || strings[i].contains("")){
                return false;
            }
        }
        return true;
    }

    /*判断引用类型数组是否为空，为空或null返回true，否则返回false*/
    public static <T> boolean isEmpty(List<T> arr){
        for (int i = 0;i<arr.size();i++){
            if(arr.get(i) == null || arr.contains("")){
                return true;
            }
        }
        return false;
    }



    /*判断字符串是否相等，相等返回true，否则返回false。其中一个是null时返回false*/
    public static boolean equals(String str1,String str2){

        if((str1 !=null || str2 != null) && str1.equals(str2)){
                return true;
        }else {
                return false;
        }

    }

    /*判断n1、n2是否相等，相等返回true，否则返回false。其中一个是null时返回false*/
    public static boolean equals(Integer n1,Integer n2){

        if((n1 !=null || n2 != null) && n1.equals(n2)){
            return true;
        }else {
            return false;
        }
    }

//    static class ClassT<T>{
//        private List<T> lis = new ArrayList<T>();
//        public void add(T t){
//            lis.add(t);
//        }
//    }
}
