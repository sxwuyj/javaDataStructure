package com.wuyj.moudle.service.impl;

import com.wuyj.moudle.service.FiyBehavior;

/**
 * 火箭推进器
 *
 * @author wuyj
 * @date 2022/1/18 11:13 下午
 */
public class FlyRocketPowered implements FiyBehavior {
    @Override
    public void fly() {
        System.out.println("rocket");
    }
}
