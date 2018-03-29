package com.zinc.libdecorator;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description 装饰类的基类
 */

public abstract class RequestDecorator extends Request {

    private Request mRequest;

    /**
     *
     * @date 创建时间 2018/3/28
     * @author Jiang zinc
     * @Description 设置需要装饰的被装饰类
     * @version
     *
     */
    public RequestDecorator(Request request) {
        this.mRequest = request;
    }

    @Override
    public String getReqResult() {
        return mRequest.getReqResult();
    }

}
