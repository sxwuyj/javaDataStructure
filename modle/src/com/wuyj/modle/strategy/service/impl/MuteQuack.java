package com.wuyj.modle.strategy.service.impl;

import com.wuyj.modle.strategy.service.QuackBehavior;

/**
 * 不会叫
 *
 * @author wuyj
 * @date 2022/1/18 10:54 下午
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("什么都不做,不会叫 ");
    }
}
