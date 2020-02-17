package com.pjc.study.proxy1227;

/**
 * @program: javales
 * @description: 数据库读写操作接口
 * @author: pjc
 * @create: 2020-01-16 15:25
 **/
public class User2Dao{


    public boolean save(User user){
//        System.out.println("保存用户"+user.getName());
        System.out.println(String.format("保存用户2：%s,%s",user.getName(),user.getAge()));
        return true;
    }

    public boolean delete(User user) {
        System.out.println(String.format("删除用户2：%s",user.getName()));
        return false;
    }
}


