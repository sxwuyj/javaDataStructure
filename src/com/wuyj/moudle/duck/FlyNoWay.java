package com.wuyj.moudle.duck;

/**
 * @author wuyj
 * @date 2022/1/18 10:51 下午
 */
public class FlyNoWay implements FiyBehavior{
    @Override
    public void fly() {
        System.out.println("什么都不做");
    }
}
