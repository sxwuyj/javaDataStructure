package com.wuyj.modle.observer.custom;

import com.wuyj.modle.observer.custom.service.impl.WeatherData;

/**
 * @author wuyj
 * @date 2022/1/19 8:32 下午
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(82,70,29.2f);
        weatherData.setMeasurements(78,90,29.4f);
    }
}
