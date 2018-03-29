package com.zinc.libdecorator;

import sun.security.provider.MD5;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description md5加密
 */

public class Md5Request extends RequestDecorator {

    public Md5Request(Request request) {
        super(request);
    }

    @Override
    public String getReqResult() {

        String reqResult = super.getReqResult();
        System.out.println("Md5加密");

        return "已经Md5加密:【"+reqResult+"】";
    }
}
