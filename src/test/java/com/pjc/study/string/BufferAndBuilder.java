package com.pjc.study.string;

import com.pjc.study.string1210.utils.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BufferAndBuilder {

    @Test
    public void test(){
        /*容量大小默认为16，也可以指定
           大小不够时会产生扩容，抛弃原数组，创建新数组，然后arraycopy*/
        StringBuffer sb = new StringBuffer(32);
        sb.append("hello"+" world"+1);
        System.out.println(sb);

        //可设置长度，打印出来会打印不完全或者过长有乱码
        sb.setLength(10);
        System.out.println(sb);

    }

    @Test
    public void test2(){
        long start = System.currentTimeMillis();
        String str = "";
        for (int n =0;n<50000;n++){
            str +=n;
        }
        System.out.println(str.length());
        System.out.println(String.format("耗时：%d ms",System.currentTimeMillis()-start));

        start = System.currentTimeMillis();
        str="";
        StringBuffer sb = new StringBuffer();
        for (int n =0;n<50000;n++){
//            sb.append(str);
            sb.append(n);
        }
        str = sb.toString();
        System.out.println(str.length());
        System.out.println(String.format("耗时：%d ms",System.currentTimeMillis()-start));

    }

    @Test
    public void test3(){
        String str = "hello";

        String str2 = StringUtils.trimAll(new StringBuffer(" h e  llo  ").toString());
        System.out.println(str.equals(str2));
        System.out.println("***************************");
        //实际结果 和期望结果
        Assert.assertEquals(StringUtils.trimAll("he l l  o   ").toString(),"hello");
    }

}
