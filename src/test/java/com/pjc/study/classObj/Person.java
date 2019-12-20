package com.pjc.study.classObj;

/**
 * @program: javales
 * @description: 人实体类
 * @author: pjc
 * @create: 2019-12-18 08:12
 **/
public class Person {
    //实例变量，域变量
    private String name;
    private Integer age;
    private String sex;

    //类变量，静态域变量
    private static Integer count;

    //两个构造器（无参、有参）
    public Person() {
        this("a",1,"man");
        System.out.println("调用了无参构造器");
    }
    public Person(String name, Integer age, String sex) {
//        this();
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("调用了有参构造器");
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    //静态方法
    public static void play(String name){
        System.out.println(name+"玩耍");
    }

    {
        //代码块，初始化代码块
        System.out.println("类里，方法外用大括号括起来的一段代码");
    }

    static {
        //静态代码块，也可以称为静态初始化代码块
        System.out.println("类里，方法外用大括号括起来且前边有static修饰的一段代码");
    }

    //内部类
    class   InnerClass{

    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public static Integer getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static void setCount(Integer count) {
        Person.count = count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}


