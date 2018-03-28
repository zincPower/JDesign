package com.zinc.libchainofresponsibility;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description handler处理完后，返回的请求
 */

public class Response {

    private String content;

    public Response(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
