package com.pjc.study.proxy1227;

import java.lang.reflect.Proxy;

/**
 * @program: javales
 * @description: 业务层
 * @author: pjc
 * @create: 2020-01-16 15:32
 **/
public class UserService {

    private static void directCall(){
        User user1 = new User("张三",21);
        new UserDaoImpl().save(user1);
        User user2 = new User("",18);
        new UserDaoImpl().save(user2);
        User user3 = new User("李四",-10);
        new UserDaoImpl().save(user3);
    }

    private static void proxyCall(){
        //模拟出一个人，来调用save方法
        User user1 = new User("俊材",221);
        UserDao userDao = new UserDaoImpl();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        //调用代理类的save方法
        userDaoProxy.save(user1);
    }

    private static void jdkProxyCall(){
        //模拟出一个人，来调用save方法
        User user1 = new User("俊材",221);
        UserDao userDao = new UserDaoImpl();

        UserInvocationHandler handler = new UserInvocationHandler(userDao);

        UserDao userDaoProxy =(UserDao) Proxy.newProxyInstance(
                userDao.getClass().getClassLoader(),
                userDao.getClass().getInterfaces(),
                handler

        );
        userDaoProxy.save(user1);
        userDaoProxy.delete(user1);
    }

    private static void cglibPorxyCall(){
        User user = new User("张三",21);
        User2Dao user2Dao = new User2Dao();

        //可以实现类的代理
        User2DaoCglibProxy cglibProxy = new User2DaoCglibProxy(user2Dao);
        User2Dao user2DaoProxy = (User2Dao) cglibProxy.getProxyInstance();
        user2DaoProxy.save(user);

        //也可以代理 实现了接口的类
        UserDao userDao = new UserDaoImpl();
        User2DaoCglibProxy cglib = new User2DaoCglibProxy(userDao);
        UserDao userDao1 = (UserDao) cglib.getProxyInstance();
        userDao1.save(user);
    }

    public static void main(String[] args) {
        //直接调用
//        directCall();

        //静态代理
        /* （如果UserDao接口发生变化，新增了方法，那么静态代理需要手动去改代码实现
               而动态代理只需要实现方法即可）
         */
//        proxyCall();

        //动态代理（jdk特性）
//        jdkProxyCall();

        //cglib代理,因为是通过子类的方式来实现的，因此也叫"子类代理"
        cglibPorxyCall();


    }
}


