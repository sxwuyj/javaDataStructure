package com.wuyj.modle.template;

/**
 * @author wuyj
 * @date 2022/1/23 6:59 下午
 */
public class Coffee extends CaffeineBeverage {


    public void brewCoffeeGrinds(){
        System.out.println("Dripping Coffee through filter");
    }


    public void addSugarAndMilk(){
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
