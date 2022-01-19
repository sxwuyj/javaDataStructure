package com.wuyj.moudle.duck;

import com.wuyj.moudle.service.impl.FlyNoWay;
import com.wuyj.moudle.service.impl.Quack;

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
