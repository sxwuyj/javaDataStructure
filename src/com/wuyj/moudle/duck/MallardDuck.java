package com.wuyj.moudle.duck;

/**
 * @author wuyj
 * @date 2022/1/18 10:57 下午
 */
public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        fiyBehavior = new FlyWithWings();
    }
    public void display(){
        System.out.println("MallardDuck");
    }
}
