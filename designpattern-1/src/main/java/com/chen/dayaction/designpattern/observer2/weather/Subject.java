package com.chen.dayaction.designpattern.observer2.weather;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
