package com.pjc.study.proxy1227;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import javax.xml.transform.Result;
import java.lang.reflect.Method;

/**
 * @program: javales
 * @description: cglib代理
 * @author: pjc
 * @create: 2020-02-17 11:02
 **/
public class User2DaoCglibProxy implements MethodInterceptor {

    private Object object;

    public User2DaoCglibProxy(Object object) {
        this.object = object;
    }

    //调用这个方法会默认调用下面的 intercept方法
    public Object getProxyInstance(){
        Enhancer en = new Enhancer();
        //设置父类，就是被代理的对象
        en.setSuperclass(object.getClass());
        //设置回调（this当前）
        en.setCallback(this);

        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始执行cglib代理");
        Object result = method.invoke(object,objects);
        System.out.println("结束执行cglib代理");
        return result;
    }
}


