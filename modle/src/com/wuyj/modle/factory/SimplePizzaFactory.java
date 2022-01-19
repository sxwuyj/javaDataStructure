package com.wuyj.modle.factory;

/**
 * @author wuyj
 * @date 2022/1/19 10:42 下午
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        }else if (type.equals("greek")){
            pizza = new GreekPizza();
        }else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
