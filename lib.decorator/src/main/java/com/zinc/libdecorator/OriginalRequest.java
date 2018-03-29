package com.zinc.libdecorator;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description 真正的请求体（没有做任何处理）
 */

public class OriginalRequest extends Request {

    private String content;

    public OriginalRequest(String content) {
        this.content = content;
    }

    @Override
    public String getReqResult() {
        return content;
    }
}
