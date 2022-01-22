package com.wuyj.modle.factory;

/**
 * @author wuyj
 * @date 2022/1/22 8:47 下午
 */
public class ChicagoPizzaShop extends PizzaShop{
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else {
            return null;
        }
    }
}
