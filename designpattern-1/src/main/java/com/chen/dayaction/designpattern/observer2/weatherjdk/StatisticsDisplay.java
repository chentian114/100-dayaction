package com.chen.dayaction.designpattern.observer2.weatherjdk;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    public static final String NAME  = "【天气统计】";

    @Override
    public void display() {
        System.out.println(NAME+"气象布告板：");
        System.out.println(NAME+"温度："+temperature);
        System.out.println(NAME+"温度："+humidity);
        System.out.println(NAME+"气压："+pressure);
    }

    @Override
    public void update(Observable observable, Object obj) {
        System.out.println(NAME+"气象布告板数据通知更新...");
        if(observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.pressure = weatherData.getPressure();
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.display();
        }
    }
}
