package com.zinc.libproxy.dynamic2;


import java.lang.reflect.InvocationHandler;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/24
 * @description
 */

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Subject subject = new RealSubject();
//        InvocationHandler invokeHandler = new MyInvocationHandler(subject);

//        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), invokeHandler);

//        Thread.sleep(2_000);

        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);

        proxy.doSomething("Finish");
    }

}
