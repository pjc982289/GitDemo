package com.pjc.study.string1210.utils;

public class StringUtils {

    public static String trimAll(String str){

        StringBuffer sb  =new StringBuffer();
        for (int i=0;i<str.length();i++){
            if(' ' == (str.charAt(i))){
               continue;
            }
            sb.append(str.charAt(i));
        }
        String str2 = sb.toString();
        return str2;
    }
}
