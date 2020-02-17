package com.pjc.study.proxy1227;

/**
 * @program: javales
 * @description: 代理
 * @author: pjc
 * @create: 2020-01-17 16:07
 **/
public class UserDaoProxy implements UserDao{

    private UserDao target;

    public UserDaoProxy() {
    }

    public UserDaoProxy(UserDao userDao) {
        this.target = userDao;
    }

    @Override
    public boolean save(User user) {
        if(user.getName() == null || user.getName().trim().length() == 0){
            System.out.println("名字不能为空");
            return false;
        }
        if(user.getAge() <= 0 || user.getAge() >= 200){
            System.out.println("年龄必须要在0-200之间");
            return false;
        }
        return this.target.save(user);
    }

    @Override
    public boolean delete(User user) {
        return false;
    }
}


