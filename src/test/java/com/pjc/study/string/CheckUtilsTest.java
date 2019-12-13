package com.pjc.study.string;

import com.pjc.study.string1210.utils.CheckUtils;
import org.testng.annotations.Test;

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

        List<String> stu = new ArrayList<>();
        stu.add("zxc");
        stu.add("qwe");
        stu.add(null);

        List<Integer> stu2 = new ArrayList<>();
        stu2.add(1);
        stu2.add(2);
        stu2.add(3);

        System.out.println(CheckUtils.isEmpty(stu)+"**");
        System.out.println(CheckUtils.isEmpty(stu2));
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
