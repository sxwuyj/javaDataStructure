package com.wuyj.modle.strategy.duck;

import com.wuyj.modle.strategy.service.FiyBehavior;
import com.wuyj.modle.strategy.service.QuackBehavior;

/**
 *
 * 所有鸭子的超类,抽象所有鸭子共有的部分
 * 将可能变化的如何飞,如何叫都抽象.
 *
 * @author wuyj
 * @date 2022/1/18 10:47 下午
 */
public abstract class Duck {
    //面向接口编程,不关注实现
    FiyBehavior fiyBehavior;
    QuackBehavior quackBehavior;

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        fiyBehavior.fly();
    }


    public void swim(){
        System.out.println("游泳");
    }
    //
    public abstract void display();

    public void setFiyBehavior(FiyBehavior fiyBehavior) {
        this.fiyBehavior = fiyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
