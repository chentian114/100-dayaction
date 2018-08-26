package com.chen.dayaction.designpattern.observer2.weather;

/**
 * 观察者接口
 * update方法修改：温度、湿度、气压值
 */
public interface Observer {
    public void update(float temperature,float humidity,float pressure);
}
