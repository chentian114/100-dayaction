package com.chen.dayaction.designpattern.observer2.weatherjdk;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public void meassurementsChanged(float temperature,float humidity,float pressure){
        System.out.println("收到气象站天气数据：temperature:"+temperature+" humidity:"+humidity+" pressure:"+pressure);
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        setChanged();       //设置change，允许通知观察者
        notifyObservers();
    }

    public float getTemperature(){
        return this.temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public float getPressure() {
        return pressure;
    }
}
