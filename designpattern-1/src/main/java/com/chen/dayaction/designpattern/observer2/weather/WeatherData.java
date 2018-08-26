package com.chen.dayaction.designpattern.observer2.weather;

import com.alibaba.fastjson.JSON;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private Set<Observer> observers;

    public WeatherData(){
        this.observers = new HashSet<>();
    }

    public void meassurementsChanged(float temperature,float humidity,float pressure){
        System.out.println("收到气象站天气数据：temperature:"+temperature+" humidity:"+humidity+" pressure:"+pressure);
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer == null || observers==null || observers.isEmpty()){
            return;
        }
        if(observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        if(observers == null || observers.isEmpty()){
            return;
        }
        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        for (Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }
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
