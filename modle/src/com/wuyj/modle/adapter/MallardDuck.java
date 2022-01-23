package com.wuyj.modle.adapter;

/**
 * @author wuyj
 * @date 2022/1/23 2:14 下午
 */
public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("I`M  flying");
    }
}
