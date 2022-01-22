package com.wuyj.modle.factory;

/**
 * @author wuyj
 * @date 2022/1/22 8:47 下午
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaShop nyPizzaShop = new NYPizzaShop();
        ChicagoPizzaShop chicagoPizzaShop = new ChicagoPizzaShop();

        Pizza cheese = nyPizzaShop.orderPizza("cheese");
        System.out.println(cheese);

        Pizza pizza = chicagoPizzaShop.orderPizza("cheese");
        System.out.println(pizza);
    }
}
