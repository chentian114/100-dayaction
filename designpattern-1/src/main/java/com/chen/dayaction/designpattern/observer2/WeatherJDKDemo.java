package com.chen.dayaction.designpattern.observer2;

import com.chen.dayaction.designpattern.observer2.weatherjdk.CurrentConditionsDisplay;
import com.chen.dayaction.designpattern.observer2.weatherjdk.ForecastDisplay;
import com.chen.dayaction.designpattern.observer2.weatherjdk.StatisticsDisplay;
import com.chen.dayaction.designpattern.observer2.weatherjdk.WeatherData;

/**
 * 气象布告板案例(使用JDK内置的观察者模式实现)
 */
public class WeatherJDKDemo {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData(); //主题对象
        CurrentConditionsDisplay currentObserver = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsObserver = new StatisticsDisplay();
        ForecastDisplay forecastObserver = new ForecastDisplay();

        weatherData.addObserver(currentObserver);
        weatherData.addObserver(statisticsObserver);
        weatherData.meassurementsChanged(23,34,56.5f);

        weatherData.addObserver(forecastObserver);
        weatherData.meassurementsChanged(25,38,76.5f);

        weatherData.deleteObserver(statisticsObserver);
        weatherData.meassurementsChanged(24,32,66.5f);
    }
}
