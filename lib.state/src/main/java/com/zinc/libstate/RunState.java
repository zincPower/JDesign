package com.zinc.libstate;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/6/6
 * @description
 */

public class RunState extends LiftState {
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        System.out.println("电梯上下运行...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOP_STATE);
        super.context.getLiftState().stop();
    }
}
