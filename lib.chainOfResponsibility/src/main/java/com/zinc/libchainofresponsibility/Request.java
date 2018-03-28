package com.zinc.libchainofresponsibility;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description 需要让handler处理的实体
 */

public class Request {

    private Level mLevel;

    public Request(Level mLevel) {
        this.mLevel = mLevel;
    }

    public Level getLevel() {
        return this.mLevel;
    }
}
