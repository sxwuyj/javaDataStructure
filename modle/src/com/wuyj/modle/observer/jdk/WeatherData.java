package com.wuyj.modle.observer.jdk;

import java.util.Observable;

/**
 * @author wuyj
 * @date 2022/1/19 6:48 下午
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }



    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
