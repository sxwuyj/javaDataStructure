package com.wuyj.moudle.duck;

/**
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
