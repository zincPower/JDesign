package com.zinc.libproxy.dynamic;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/18
 * @description
 */

public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("用户" + user + "登陆成功，登录名称：" + this.name);
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "正在打怪！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "升了一级！");
    }

}
