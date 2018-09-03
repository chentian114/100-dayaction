package com.chen.dayaction.designpattern.observer2.magazine;

import java.util.HashSet;
import java.util.Set;

public interface Subject {
    public Set<Observer> observers = new HashSet<>();
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
