package com.pjc.study.proxy1227;

/**
 * @program: javales
 * @description: 数据库读写操作接口
 * @author: pjc
 * @create: 2020-01-16 15:25
 **/
public class UserDaoImpl implements UserDao{

    @Override
    public boolean save(User user){
//        System.out.println("保存用户"+user.getName());
        System.out.println(String.format("保存用户：%s,%s",user.getName(),user.getAge()));
        return true;
    }

    @Override
    public boolean delete(User user) {
        System.out.println(String.format("删除用户：%s",user.getName()));
        return false;
    }
}


