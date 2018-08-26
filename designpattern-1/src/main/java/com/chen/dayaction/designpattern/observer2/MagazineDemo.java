package com.chen.dayaction.designpattern.observer2;

import com.chen.dayaction.designpattern.observer2.magazine.Magazine;
import com.chen.dayaction.designpattern.observer2.magazine.ObserverPeople;

/**
 * 订阅杂志案例：订阅杂志，有Magazine对象，People对象
 * 将观察者与被观察者（主题）解耦，普通类只需简单实现一个接口或抽象类就可以转换成观察者类，
 * 而且不需要观察者不断向被观察者抓取数据，
 * 被观察者会主动将自己的改变通知给多个观察者。
 * 在观察者中分为两种push模型与pull模式。
 *
 * push模型
 * 　　　　push模型是指被观察者发生改变时，将状态改变的信息全部或部分发送给观察者。
 * pull模型
 * 　　　　pull模型是指被观察者发生改变时，将被观察者对象发送观察者，观察者可以自己获取感兴趣的内容。
 *
 * 观察者模式给程序员提供一个建立对象之间一对多关联关系的良好方法，并能够将信息生成层与响应层分离，给以后的修改留下很好的结构。
 */
public class MagazineDemo {

    public static void main(String[] args) {
        Magazine magazine = new Magazine("时尚杂志",20);
        ObserverPeople zhangsan = new ObserverPeople("张三");
        ObserverPeople zhaosi = new ObserverPeople("赵四");

        magazine.registerObserver(zhangsan);
        magazine.registerObserver(zhaosi);

        magazine.setContent("最新时尚杂志发布。。。");
    }

}
