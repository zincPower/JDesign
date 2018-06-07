package com.zinc.libstate;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/6/6
 * @description
 */

public class StopState extends LiftState {
    @Override
    public void open() {
        super.context.setLiftState(Context.OPEN_STATE);
        super.context.getLiftState().open();
    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUN_STATE);
        super.context.getLiftState().run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
