package com.wuyj.modle.factory;

/**
 *
 * 纽约披萨加盟店
 *
 * @author wuyj
 * @date 2022/1/22 8:27 下午
 */
public class NYPizzaShop extends PizzaShop{

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if (type.equals("clam")){
            return new NYStyleVeggiePizza();
        }else if (type.equals("pepperoni")){
            return new NYStylePepperpniPizza();
        }else {
            return null;
        }
    }
}
