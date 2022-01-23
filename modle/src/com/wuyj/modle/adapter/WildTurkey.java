package com.wuyj.modle.adapter;

/**
 * @author wuyj
 * @date 2022/1/23 2:16 下午
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("我飞不远");
    }
}
