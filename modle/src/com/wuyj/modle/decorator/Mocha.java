package com.wuyj.modle.decorator;

/**
 * @author wuyj
 * @date 2022/1/19 9:56 下午
 */
public class Mocha extends  CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
