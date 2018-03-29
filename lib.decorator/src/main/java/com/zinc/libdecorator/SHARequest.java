package com.zinc.libdecorator;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description sha加密
 */

public class SHARequest extends RequestDecorator {

    public SHARequest(Request request) {
        super(request);
    }

    @Override
    public String getReqResult() {

        String reqResult = super.getReqResult();
        System.out.println("sha加密");

        return "已经sha加密:【" + reqResult+"】";
    }

}
