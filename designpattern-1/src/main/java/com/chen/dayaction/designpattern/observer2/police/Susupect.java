package com.chen.dayaction.designpattern.observer2.police;

import java.util.HashSet;
import java.util.Set;

/**
 * 嫌犯
 */
public class Susupect implements Subject{
    private Set<Observer> observers;
    private String name ;
    private String activeInfo;  //活动信息

    public Susupect(){
        this.observers = new HashSet<>();
        this.name = "【嫌犯】大地黑熊，";
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer == null){
            return;
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer == null || observers.isEmpty()){
            return;
        }
        if(observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this.activeInfo);
        }
    }

    public void updateActiveInfo(String info){
        this.activeInfo = info;
        System.out.println(this.name+info);
        notifyObservers();
    }
}
