package com.wuyj.modle.decorator;

/**
 * Espresso 饮料
 * @author wuyj
 * @date 2022/1/19 9:51 下午
 */
public class Espresso extends Beverage{

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
