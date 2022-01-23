package com.wuyj.modle.template;

/**
 * @author wuyj
 * @date 2022/1/23 7:06 下午
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe(){
       boilWater();
       brew();
       pourInCup();
       addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    public void boilWater(){
        System.out.println("Boiling water");
    }
    public void pourInCup(){
        System.out.println("Pouring into cup");
    }

}
