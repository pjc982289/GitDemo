package com.pjc.study.string;

import org.testng.annotations.Test;

public class StringTest {

    @Test
    public void testString(){
        String str1 = "hello";
        String str2 = "hello";
        String str4 = str1+" world";
        String str3 = "hello world";
        String str5 = new String("hello");
        String str6 = new String("hello");
        String str7 = str6.intern();
        //true，都在常量池中
        System.out.println(str1==str2);
        //false
        System.out.println(str3==str4);
        //false,在堆中，地址不一样
        System.out.println(str5==str6);
        //true,intern方法会去常量池中找，所以str7实际指向常量池的地址
        System.out.println(str1==str7);
        //true，比较值
        System.out.println(str3.equals(str4));
        //忽略大小写的值比较
        System.out.println(str3.equalsIgnoreCase(str4));
    }

    @Test
    public void testLength(){
        String str = "hello world ";
        //12,空格(中间和末尾)也算长度
        System.out.println(str.length());
        //两个参数表示截取中间段，前闭后开
        String str2 = str.substring(1,3);
        //一个参数表示截取之后，包括这个数的下标
        String str3 = str.substring(4);
        System.out.println(str2);
        System.out.println(str3);
    }

    @Test
    public void testFormat(){
        /*占位符 %s字符串。%c字符类型，%d整数型，%b布尔类型
         %x（16进制整形），%o八进制，%f浮点类型*/
        String str = String.format("%s,%d,%b","a",20,false);
        System.out.println(str);
    }

    @Test
    public void testJu(){
        String str = "  hello world  ";

        //true，是否以什么开头
        System.out.println(str.startsWith("he"));

        //true，是否以什么结尾
        System.out.println(str.endsWith("ld"));

        //false，是否包含
        System.out.println(str.contains("w "));

        //5，字符的下标(第二个参数为从哪儿开始找)
        System.out.println(str.indexOf(" ",4));

        //替换
        System.out.println(str.replace("o","E"));

        //trim去前后空格,转小写
        System.out.println(str.trim().toLowerCase());
        //转大写
        System.out.println(str.trim().toUpperCase());
    }
}
