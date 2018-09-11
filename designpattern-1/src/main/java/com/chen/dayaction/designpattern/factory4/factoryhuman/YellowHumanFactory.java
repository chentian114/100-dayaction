package com.chen.dayaction.designpattern.factory4.factoryhuman;

public class YellowHumanFactory implements HumanFactory {
    @Override
    public Human factoryMethod() {
        return new YellowHuman();
    }
}
