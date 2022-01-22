package com.wuyj.modle.factory;

/**
 * @author wuyj
 * @date 2022/1/19 10:37 下午
 */
public abstract class PizzaShop {


    Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }

    /**
     * 将创建披萨的方法抽象,由子类实现
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
