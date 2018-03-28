package com.zinc.libchainofresponsibility.handler;

import com.zinc.libchainofresponsibility.Level;
import com.zinc.libchainofresponsibility.Request;
import com.zinc.libchainofresponsibility.Response;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description 处理类的基类
 */

public abstract class Handler {

    //指向下一个处理类
    private Handler nextHandler;

    public final Response handleMessage(Request request) {
        Response response = null;

        //判断是否是自己的处理等级
        if (request.getLevel().getDay() <= this.getHandlerLevel().getDay()) {
            //是自己的处理等级，就将其进行处理
            response = this.echo(request);
        } else {

            //如果还有下一个handler
            if (this.nextHandler != null) {
                //如果有就让下一个handler进行处理
                response = this.nextHandler.handleMessage(request);
            } else {
                //没有适当的处理者，由调用者自己处理，获取不处理
            }

        }

        return response;

    }

    /**
     * @date 创建时间 2018/3/28
     * @author Jiang zinc
     * @Description 设置下一个handler处理类
     * @version
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * @date 创建时间 2018/3/28
     * @author Jiang zinc
     * @Description 模版方法，由子类决定当前实现的实体类是什么等级
     * @version
     */
    protected abstract Level getHandlerLevel();

    /**
     * @date 创建时间 2018/3/28
     * @author Jiang zinc
     * @Description 对任务的具体处理操作
     * @version
     */
    protected abstract Response echo(Request request);

}
