package com.pjc.study.extends1219;

import org.testng.annotations.Test;
import sun.plugin2.message.Message;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: javales
 * @description: 继承类测试类
 * @author: pjc
 * @create: 2019-12-20 15:30
 **/
public class ExtendsTest {

    @Test
    public void testPrint(){
        Employee em = new Employee();
        em.setName("员工1");
        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        em.setHireDay(d);
        em.setSalary(1000);
        em.printInfo();

        System.out.println("==================");

        Manager m = new Manager();
        m.setName("经理1");
        m.setHireDay(new Date());
        m.setSalary(1500);
        m.setBonus(70);
        m.printInfo();

        System.out.println("==================");

        Manager m2 = new Manager("asb",new Date(),1700,50);
        System.out.println(m2);
    }

    @Test
    public void testDuotai(){
        Employee em = new Employee("员工1",new Date(),1000);
        Manager m = new Manager("经理1",new Date(),1000,50);
        MasterManager mm = new MasterManager("总经理1",new Date(),1000,200);
        //此时调用的是经理的打印方法（动态绑定）em实际类型是"经理"
        em = m;
        em.printInfo();
        System.out.println("================");
        em = mm;
        em.printInfo();
    }

    @Test
    public void testObj(){
        Employee em = new Employee();
        System.out.println(em.getClass().getName());
        System.out.println(em.getClass().getSimpleName());
        System.out.println("===============");

        em = new Manager();
        System.out.println(em.getClass().getName());
    }

    @Test
    public void testAbs() {
        Person p1 = new Teacher();
        p1.distincte();
        System.out.println("============");
        Person p2 = new Student();
        p2.distincte();

        //错误，不能实例化抽象类
//        Person p3 = new Person();
    }

    @Test
    public void test1(){
        Manager m = new Manager();
//        Employee em = new Employee();
//        em.setSalary(100);
//        m.setBonus(10);
        System.out.println(m.toString());
        System.out.println(m.getSalary());
    }
}


