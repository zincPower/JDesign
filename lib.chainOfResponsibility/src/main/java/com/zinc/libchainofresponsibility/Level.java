package com.zinc.libchainofresponsibility;

/**
 * @author Jiang zinc
 * @date 创建时间：2018/3/28
 * @description 用于保存处理实体登记信息
 */

public class Level {

    private String levelName;
    private int day;

    public Level(String levelName, int day) {
        this.levelName = levelName;
        this.day = day;
    }

    public Level(int day) {
        this.day = day;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
