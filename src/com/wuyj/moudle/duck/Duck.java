package com.wuyj.moudle.duck;

/**
 * @author wuyj
 * @date 2022/1/18 10:47 下午
 */
public abstract class Duck {
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
    public abstract void display();

    public void setFiyBehavior(FiyBehavior fiyBehavior) {
        this.fiyBehavior = fiyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
