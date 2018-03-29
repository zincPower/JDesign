package com.zinc.libdecorator;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description
 */

public class Client {

    public static void main(String[] args) {
        Request request1 = new OriginalRequest("我是猛猛的小盆友。");
        request1 = new Md5Request(request1);
        request1 = new SHARequest(request1);

        System.out.println(request1.getReqResult());

        Request request2 = new OriginalRequest("我是猛猛的小盆友。");
        request2 = new SHARequest(request2);
        request2 = new LalaRequest(request2);
        request2 = new Md5Request(request2);

        System.out.println(request2.getReqResult());

    }

}
