package com.wuyj.moudle.duck;

/**
 * @author wuyj
 * @date 2022/1/18 10:53 下午
 */
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
