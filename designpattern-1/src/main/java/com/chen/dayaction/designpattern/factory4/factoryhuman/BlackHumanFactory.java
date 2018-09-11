package com.chen.dayaction.designpattern.factory4.factoryhuman;

public class BlackHumanFactory implements HumanFactory {
    @Override
    public Human factoryMethod() {
        return new BlackHuman();
    }
}
