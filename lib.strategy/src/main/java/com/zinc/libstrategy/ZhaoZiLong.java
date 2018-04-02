package com.zinc.libstrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/4/2
 * @description
 */

public class ZhaoZiLong {

    public static void main(String[] args) {
//        List<SilkBag> silkBagList = new ArrayList<>();
//        silkBagList.add(new SilkBag(new QiaoGuoLaoStrategy()));
//        silkBagList.add(new SilkBag(new WuGuoTaiStrategy()));
//        silkBagList.add(new SilkBag(new SunFuRenEnemy()));
//
//        int i = 1;
//        for (SilkBag silkBag : silkBagList) {
//            System.out.println("赵子龙第" + (i++) + "次遇困难，使用锦囊：");
//            silkBag.operate();
//        }

        for (int i = 1; i <= 3; ++i) {
            System.out.println("赵子龙第" + i + "次遇困难，使用锦囊：");
            SilkBagFactory.getStrategy(i).operate();
        }

    }

}
