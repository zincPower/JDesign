package com.zinc.libstrategy;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/4/2
 * @description
 */

public class SilkBagFactory {

    public static SilkBag getStrategy(int i){
        SilkBag silkBag = null;
        switch (i){
            case 1:
                silkBag = new SilkBag(new QiaoGuoLaoStrategy());
                break;
            case 2:
                silkBag = new SilkBag(new WuGuoTaiStrategy());
                break;
            case 3:
                silkBag = new SilkBag(new SunFuRenEnemy());
                break;
        }
        return silkBag;
    }

}
