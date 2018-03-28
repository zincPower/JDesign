package com.zinc.libproxy.dynamic2;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/24
 * @description
 */

public class BeforeAdvice implements IAdvice {

    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了");
    }

}
