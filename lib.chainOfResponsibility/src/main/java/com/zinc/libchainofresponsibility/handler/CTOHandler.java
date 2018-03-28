package com.zinc.libchainofresponsibility.handler;

import com.zinc.libchainofresponsibility.Level;
import com.zinc.libchainofresponsibility.Request;
import com.zinc.libchainofresponsibility.Response;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description
 */

public class CTOHandler extends Handler {
    @Override
    public Level getHandlerLevel() {
        return new Level("技术总监", 5);
    }

    @Override
    public Response echo(Request request) {
        return new Response("我是"+getHandlerLevel().getLevelName()+"，我准了！");
    }
}
