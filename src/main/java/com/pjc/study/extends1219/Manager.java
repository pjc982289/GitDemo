package com.pjc.study.extends1219;

import java.util.Date;

/**
 * @program: javales
 * @description: 经理
 * @author: pjc
 * @create: 2019-12-20 15:18
 * 只能单继承
 **/
public class Manager extends Employee {

    /**
     * 奖金
     * */
    private Integer bonus;

    /*子类调用构造器时会默认调用父类的无参构造器*/
    public Manager() {
        System.out.println("经理的无参构造");
    }
    public Manager(Integer bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, Date hireDay, Integer salary, Integer bonus) {
        super(name, hireDay, salary);
        this.bonus = bonus;
        System.out.println("经理的有参构造");

    }

    public Integer getBonus() {
        return bonus;
    }
    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：");
        sb.append(this.getName());
        sb.append("入职时间：");
        sb.append(this.getHireDay());
        sb.append("薪水：");
        sb.append(this.getSalary());
        sb.append("奖金：");
        sb.append(getBonus());
        System.out.println(String.format("***%s",sb));
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + super.getName() + '\'' +
                ", hireDay=" + super.getHireDay() +
                ", salary=" + super.getSalary() +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public String getName(){
        System.out.println("经理姓名： ");
        return super.getName();
    }
}


