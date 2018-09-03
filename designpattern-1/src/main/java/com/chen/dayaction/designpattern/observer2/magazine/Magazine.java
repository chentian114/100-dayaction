package com.chen.dayaction.designpattern.observer2.magazine;

import java.util.HashSet;
import java.util.Set;

public class Magazine implements Subject {


    private String name ;
    private double cost ;
    private String content;
    private boolean isChanged = false;

    public Magazine(String name,double cost){
        this.name = name ;
        this.cost = cost;
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer==null){
            return;
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(observer==null || observers.isEmpty()){
            return;
        }
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if(isChanged) {
            for (Observer observer : observers) {
                observer.update(content);
            }
        }
        isChanged = false;
    }

    public void setContent(String content){
        this.content = content;
        isChanged = true;
        notifyObservers();
    }

}
