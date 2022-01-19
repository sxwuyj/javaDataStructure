package com.wuyj.modle.observer.custom;

import com.wuyj.modle.observer.custom.service.DisplayElement;
import com.wuyj.modle.observer.custom.service.Observer;
import com.wuyj.modle.observer.custom.service.Subject;

/**
 * @author wuyj
 * @date 2022/1/19 8:19 下午
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(" Current conditions:" + temperature + "F degrees and" +humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
