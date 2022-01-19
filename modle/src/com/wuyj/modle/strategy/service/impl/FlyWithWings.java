package com.wuyj.modle.strategy.service.impl;

import com.wuyj.modle.strategy.service.FiyBehavior;

/**
 * 正常飞
 *
 * @author wuyj
 * @date 2022/1/18 10:51 下午
 */
public class FlyWithWings implements FiyBehavior {
    @Override
    public void fly() {
        System.out.println("飞起来");
    }
}
