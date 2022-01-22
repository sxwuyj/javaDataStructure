package com.wuyj.modle.factory;

import java.util.ArrayList;

/**
 * @author wuyj
 * @date 2022/1/19 10:31 下午
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough " + dough);
        System.out.println("Adding sauce " + sauce);
        System.out.println("Adding toppings: ");
        for (Object topping : toppings) {
            System.out.println(topping);
        }
    }

    public void bake() {
        System.out.println("烘烤25分钟....");
    }

    public void box() {
        System.out.println("披萨打包完成");
    }
}
