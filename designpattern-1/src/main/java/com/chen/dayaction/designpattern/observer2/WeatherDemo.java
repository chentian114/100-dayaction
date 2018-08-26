package com.chen.dayaction.designpattern.observer2;

import com.chen.dayaction.designpattern.observer2.weather.*;

/**
 * 气象布告板案例(实现观察者模式):
 * WeatherData对象获取气象站数据,当数据有更新时,需要实时更新三个气象板的数据(当前情况、气象统计、天气预报）
 */
public class WeatherDemo {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData(); //主题对象
        CurrentConditionsDisplay currentObserver = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsObserver = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastObserver = new ForecastDisplay(weatherData);

        currentObserver.registerToObservers();
        statisticsObserver.registerToObservers();
        weatherData.meassurementsChanged(23,34,56.5f);

        forecastObserver.registerToObservers();
        weatherData.meassurementsChanged(25,38,76.5f);

        weatherData.removeObserver(statisticsObserver);
        weatherData.meassurementsChanged(24,32,66.5f);
    }
}
