package com.chen.dayaction.designpattern.strategy1.stratagem;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void operate(){
        System.out.print("使用计谋：");
        strategy.operate();
    }
}
