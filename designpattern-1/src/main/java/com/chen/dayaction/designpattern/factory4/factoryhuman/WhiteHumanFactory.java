package com.chen.dayaction.designpattern.factory4.factoryhuman;

public class WhiteHumanFactory implements HumanFactory {
    @Override
    public Human factoryMethod() {
        return new WhiteHuman();
    }
}
