package com.wuyj.modle.decorator;

/**
 * 抽象类,规定类型
 * @author wuyj
 * @date 2022/1/19 9:47 下午
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
