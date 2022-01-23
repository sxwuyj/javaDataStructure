package com.wuyj.modle.template;

/**
 * @author wuyj
 * @date 2022/1/23 7:03 下午
 */
public class Tea extends CaffeineBeverage{


    public void steepTeaBag(){
        System.out.println("Steeping the tea");
    }

    public void addLemon(){
        System.out.println("add Lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
