package com.zinc.libproxy.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/24
 * @description
 */

public class SubjectDynamicProxy extends DynamicProxy {

    public static <T> T newProxyInstance(Subject subject){
        ClassLoader loader = subject.getClass().getClassLoader();
        Class<?>[] classes = subject.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandler(subject);
        return (T) Proxy.newProxyInstance(loader, classes, handler);
    }

}
