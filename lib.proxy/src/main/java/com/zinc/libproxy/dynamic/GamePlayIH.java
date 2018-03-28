package com.zinc.libproxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/18
 * @description
 */

public class GamePlayIH implements InvocationHandler {

    Class cls = null;
    Object obj = null;

    public GamePlayIH(Object _obj) {
        this.obj = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);

        System.out.println("method:" + method.getName());
        if (method.getName().equals("login")) {
            System.out.println("有人正在登录我的账号！");
        }

        return result;
    }

}
