package com.pjc.study.extends1219;

import java.util.Date;

/**
 * @program: javales
 * @description: 普通员工
 * @author: pjc
 * @create: 2019-12-20 15:18
 **/
public class Employee {

    private String name;

    /**
     * 聘用日期
     * */
    private Date hireDay;

    /**
     * 工资
     * */
    private Integer salary;

    public Employee() {
        System.out.println("员工的无参构造");
    }

    public Employee(String name, Date hireDay, Integer salary) {
        System.out.println("员工的有参构造");
        this.name = name;
        this.hireDay = hireDay;
        this.salary = salary;
    }

    public String getName() {
        System.out.print("员工姓名: ");
        return name;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void printInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("姓名：");
        sb.append(this.getName());
        sb.append("入职时间：");
        sb.append(this.getHireDay());
        sb.append("薪水：");
        sb.append(this.getSalary());
        System.out.println(String.format("***%s",sb));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDay=" + hireDay +
                ", salary=" + salary +
                '}';
    }
}


