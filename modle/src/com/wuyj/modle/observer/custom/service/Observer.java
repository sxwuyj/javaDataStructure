package com.wuyj.modle.observer.custom.service;

/**
 * @author wuyj
 * @date 2022/1/19 6:45 下午
 */
public interface Observer {

    void update(float temp,float humidity,float pressure);
}
