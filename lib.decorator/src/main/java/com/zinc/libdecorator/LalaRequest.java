package com.zinc.libdecorator;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/29
 * @description
 */

public class LalaRequest extends RequestDecorator {

    public LalaRequest(Request request) {
        super(request);
    }

    public String doSomething(){
        return "lala=====";
    }

    @Override
    public String getReqResult() {
        String reqResult = super.getReqResult();
        System.out.println("lala加密");
        return this.doSomething()+reqResult;

    }
}
