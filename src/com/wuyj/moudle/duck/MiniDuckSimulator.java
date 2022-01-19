package com.wuyj.moudle.duck;

import com.wuyj.moudle.service.impl.FlyRocketPowered;

/**
 * 测试类
 *
 * @author wuyj
 * @date 2022/1/18 11:05 下午
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFiyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
