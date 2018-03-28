package com.zinc.libproxy.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/24
 * @description
 */

public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        if (true) {
            (new BeforeAdvice()).exec();
        }
        //执行目标，返回结果
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }

}
