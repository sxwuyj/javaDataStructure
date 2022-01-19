package com.wuyj.moudle.duck;

import com.wuyj.moudle.service.FiyBehavior;
import com.wuyj.moudle.service.QuackBehavior;

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
