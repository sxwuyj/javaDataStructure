package com.wuyj.modle.strategy.service.impl;

import com.wuyj.modle.strategy.service.QuackBehavior;

/**
 * @author wuyj
 * @date 2022/1/18 10:53 下午
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
