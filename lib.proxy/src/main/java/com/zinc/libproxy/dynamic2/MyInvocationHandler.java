package com.zinc.libproxy.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/24
 * @description
 */

public class MyInvocationHandler implements InvocationHandler {

    private Object target =null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        System.out.println(method.getParameterTypes().length);

        //通过invoke执行被代理的方法
        return method.invoke(this.target, objects);

    }
}
