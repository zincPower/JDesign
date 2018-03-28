package com.zinc.libchainofresponsibility;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description
 */

public class NoDesign {

    public static void main(String[] args) {
        int level = 1;

        if (level <= 1) {
            System.out.println("我是组长，批准！");
        } else if (level <= 3) {
            System.out.println("我是部门经理，批准！");
        } else if (level <= 5) {
            System.out.println("我是CTO，批准！");
        } else {
            System.out.println("没人处理，不批准！");
        }
    }

}
