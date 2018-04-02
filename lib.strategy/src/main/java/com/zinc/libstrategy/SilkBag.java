package com.zinc.libstrategy;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/4/2
 * @description 锦囊，用于装入计谋
 */

public class SilkBag {

    private IStrategy mStrategy;

    public SilkBag(IStrategy strategy) {
        this.mStrategy = strategy;
    }

    public void operate(){
        this.mStrategy.operate();
    }

}
