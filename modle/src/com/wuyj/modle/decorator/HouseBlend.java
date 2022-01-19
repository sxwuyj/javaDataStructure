package com.wuyj.modle.decorator;

/**
 * HouseBlend 饮料
 *
 * @author wuyj
 * @date 2022/1/19 9:52 下午
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
