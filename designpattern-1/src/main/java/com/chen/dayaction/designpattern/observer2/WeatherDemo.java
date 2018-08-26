package com.chen.dayaction.designpattern.observer2;

import com.chen.dayaction.designpattern.observer2.weather.*;

/**
 * 气象布告板案例
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
