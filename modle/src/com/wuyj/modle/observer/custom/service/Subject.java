package com.wuyj.modle.observer.custom.service;

/**
 * @author wuyj
 * @date 2022/1/19 6:43 下午
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
