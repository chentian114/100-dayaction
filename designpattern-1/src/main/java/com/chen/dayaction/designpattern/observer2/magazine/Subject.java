package com.chen.dayaction.designpattern.observer2.magazine;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
