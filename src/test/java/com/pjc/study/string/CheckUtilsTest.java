package com.pjc.study.string;

import com.pjc.study.string1210.Student;
import com.pjc.study.string1210.utils.CheckUtils;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CheckUtilsTest {

    @Test
    public void testStrings(){
        String[] strs = {"abc",null,"asd","qwe","zxc",};
        System.out.println(CheckUtils.isAnyEmpty(strs));
    }

    @Test
    public void testObject(){
        Student stu1 = new Student("pjc",18,"男");
        Student stu2 = new Student("哈哈",null,"女");
        Student stu3 = new Student("asd",17,"男");
        List<Student> stu = new ArrayList<>();
        stu.add(stu1);
        stu.add(stu2);
        stu.add(stu3);
//        Student []stu = new Student[]{stu1,stu2,stu3};
        System.out.println(CheckUtils.isEmpty(stu));
    }

    @Test
    public void testString(){
        String str1 = new String("abc");
        String str2 = null;
        System.out.println(CheckUtils.equals(str1,str2));
    }

    @Test
    public void testInteger(){
        Integer i = 128;
        Integer i2 = null;
        System.out.println(CheckUtils.equals(i,i2));
    }
}
