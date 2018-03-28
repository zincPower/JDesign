package com.zinc.libproxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/18
 * @description
 */

public class Client {

    public static void main(String[] args) throws Throwable {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);

        System.out.println("开始时间 2018-03-24");

        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);

        proxy.login("zhangsan","123");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("开始时间 2018-03-25");

    }

}
