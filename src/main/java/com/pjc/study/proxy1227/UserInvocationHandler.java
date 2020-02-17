package com.pjc.study.proxy1227;

import javax.sound.midi.Soundbank;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * @program: javales
 * @description: jdk动态代理, 事件处理器
 * @author: pjc
 * @create: 2020-02-15 15:06
 **/
public class UserInvocationHandler implements InvocationHandler {
    public Object object;

    public UserInvocationHandler(Object object) {
        this.object = object;
    }

    public UserInvocationHandler() {
    }

    //被代理的对象，方法，方法的参数
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("开始执行");
        if(args != null && args.length == 1){ //只有一个参数
            if(args[0] instanceof User){
                System.out.println("参数1 数User");
                User user = (User) args[0];
                if(user.getName() == null || user.getName().trim().length() == 0) {
                    System.out.println("姓名为空");
                    return false;
                }
                if(user.getAge() <= 0 || user.getAge() >= 200){
                    System.out.println("年龄必须要在0-200之间");
                    return false;
                }
            }
        }
        Object result = method.invoke(object,args);
        System.out.println("执行结束");
        return result;
    }
}


