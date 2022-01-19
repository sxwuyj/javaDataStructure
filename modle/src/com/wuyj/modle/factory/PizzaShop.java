package com.wuyj.modle.factory;

/**
 * @author wuyj
 * @date 2022/1/19 10:37 下午
 */
public class PizzaShop {
    private SimplePizzaFactory factory;

    public PizzaShop(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    Pizza orderPizza(String type){
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
