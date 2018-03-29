package com.zinc.libdecorator.noDesign;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/29
 * @description
 */

public class NoDesign {

    public static void main(String[] args) {

        String content = "我是猛猛的小盆友。";

        content = "已经Md5加密:【" + content + "】";

        content = "已经sha加密:【" + content + "】";

        System.out.println(content);

    }

}
