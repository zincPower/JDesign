package com.zinc.libchainofresponsibility;

import com.zinc.libchainofresponsibility.handler.Handler;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description
 */

public class Client {

    public static void main(String[] args) {
        Handler handler = ResponChainHelper.getResChain();

        System.out.println("我想要请一天假：");
        Request request1 = new Request(new Level(1));
        Response response1 = handler.handleMessage(request1);
        System.out.println(response1.getContent());

        System.out.println("我想要请三天假：");
        Request request2 = new Request(new Level(3));
        Response response2 = handler.handleMessage(request2);
        System.out.println(response2.getContent());

        System.out.println("我想要请五天假：");
        Request request3 = new Request(new Level(5));
        Response response3 = handler.handleMessage(request3);
        System.out.println(response3.getContent());
    }

}
