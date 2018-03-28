package com.zinc.libchainofresponsibility.handler;

import com.zinc.libchainofresponsibility.Level;
import com.zinc.libchainofresponsibility.Request;
import com.zinc.libchainofresponsibility.Response;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description
 */

public class CEOHandler extends Handler {
    @Override
    protected Level getHandlerLevel() {
        return new Level("CEO", 10);
    }

    @Override
    protected Response echo(Request request) {
        return new Response("我是" + getHandlerLevel().getLevelName() + "，我准了！");
    }
}
