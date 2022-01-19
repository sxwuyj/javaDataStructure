package com.wuyj.moudle.duck;

import com.wuyj.moudle.service.impl.FlyWithWings;
import com.wuyj.moudle.service.impl.Quack;

/**
 * 某种鸭子,通过构造指定具体的实现
 *
 * 使用时再确定如何飞如何叫
 *
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
