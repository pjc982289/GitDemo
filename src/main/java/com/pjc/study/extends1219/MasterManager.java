package com.pjc.study.extends1219;

import java.util.Date;

/**
 * @program: javales
 * @description: 总经理
 * @author: pjc
 * @create: 2019-12-23 08:34
 **/
public class MasterManager extends Manager {

    public MasterManager() {
        System.out.println("总经理的无参");
    }


    public MasterManager(String name, Date hireDay, Integer salary, Integer bonus) {
        super(name, hireDay, salary, bonus);
        System.out.println("总经理的有参");
    }

    @Override
    public String getName(){
        System.out.println("总经理的姓名： ");
        return super.getName();
    }
}


