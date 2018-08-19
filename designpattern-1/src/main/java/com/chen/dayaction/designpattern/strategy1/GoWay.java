package com.chen.dayaction.designpattern.strategy1;

import com.chen.dayaction.designpattern.strategy1.goway.Bike;
import com.chen.dayaction.designpattern.strategy1.goway.Car;
import com.chen.dayaction.designpattern.strategy1.goway.Walk;
import com.chen.dayaction.designpattern.strategy1.goway.Way;

/**
 * 出行方式案例：根据不同的天气选择不同的出行方式：晴天选择骑行、阴天选择步行、雨天选择开小车
 * 策略模式将同一接口的不同算法实现封装在不同的类中，从而使他们可以相互替换，达到客户端不受算法变动的影响，降低耦合。
 * 1）首先要定义一系列算法或一族的算法进行封装。
 * 什么是一系列，一族？拥有同一种特性的事物就是一系列或者说一族。
 * 2）这一族的算法可互换代替。
 * 分析：
 * 1）策略模式只是对算法进行封装，把算法和行为分隔开。
 * 2）具体怎么使用由客户端决定，客户端必须先理解所有的算法之间的区别，并且决定使用哪种算法。
 * 3）这一定程度上增加了客户端使用难度，但相应的提高了系统的灵活性。
 * 4）当需要频繁增加esle if或者case的情况量，可以考虑使用策略模式减少它们之间的耦合度，提高扩展性。
 */
public class GoWay {

    public static void main(String[] args) {
        for (SelectGoWayEnum obj : SelectGoWayEnum.values()) {
            System.out.print("天气是："+obj.getWeather()+" 选择出行方式：");
            obj.getWay().go();
        }
    }


}


enum SelectGoWayEnum{
    CLOUDY("阴天",new Walk()),SUN("晴天",new Bike()),RAIN("雨天",new Car());
    private String weather;
    private Way way ;
    private SelectGoWayEnum(String weather,Way way){
        this.weather = weather;
        this.way = way;
    }
    public Way getWay(){
        return way;
    }
    public String getWeather(){
        return weather;
    }

}