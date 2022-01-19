package com.wuyj.modle.strategy.duck;

import com.wuyj.modle.strategy.service.impl.FlyNoWay;
import com.wuyj.modle.strategy.service.impl.Quack;

/**
 * 模型鸭子构造指定的实现类
 *
 * 使用时再确定如何飞如何叫
 *
 * @author wuyj
 * @date 2022/1/18 11:10 下午
 */
public class ModelDuck extends Duck{

    public ModelDuck() {
        fiyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("模型");
    }
}
