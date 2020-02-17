package com.pjc.study.proxy1227;

/**
 * @program: javales
 * @description: 实体类
 * @author: pjc
 * @create: 2020-01-16 15:20
 **/
public class User {
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


