package com.zinc.libproxy.dynamic2;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/24
 * @description
 */

public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something! ------> " + str);
    }
}
