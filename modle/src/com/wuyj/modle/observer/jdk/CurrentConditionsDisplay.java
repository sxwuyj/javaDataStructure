package com.wuyj.modle.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author wuyj
 * @date 2022/1/19 8:19 下午
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(" Current conditions:" + temperature + "F degrees and" +humidity + "% humidity");
    }



    @Override
    public void update(Observable obs, Object arg) {
        if(obs instanceof  WeatherData){
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }

    }
}
