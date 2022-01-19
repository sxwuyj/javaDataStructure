package com.wuyj.modle.observer.custom.service.impl;

import com.wuyj.modle.observer.custom.service.Observer;
import com.wuyj.modle.observer.custom.service.Subject;

import java.util.ArrayList;

/**
 * @author wuyj
 * @date 2022/1/19 6:48 下午
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList();

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i>0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Object o : observers) {
            Observer observer = (Observer) o;
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }
}
