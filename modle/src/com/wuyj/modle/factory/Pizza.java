package com.wuyj.modle.factory;

/**
 * @author wuyj
 * @date 2022/1/19 10:31 下午
 */
public class Pizza {

    public void prepare() {
        System.out.println("制作");
    }

    public void bake() {
        System.out.println("烘烤");
    }

    public void box() {
        System.out.println("打包");
    }
}
