package com.zinc.libstate;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/6/7
 * @description
 */

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(Context.CLOSE_STATE);
        context.open();
        context.close();
        context.run();
        context.stop();
    }

}
