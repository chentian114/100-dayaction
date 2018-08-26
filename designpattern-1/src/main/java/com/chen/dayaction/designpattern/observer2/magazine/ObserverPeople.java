package com.chen.dayaction.designpattern.observer2.magazine;

public class ObserverPeople implements Observer {
    private String name ;

    public ObserverPeople(String name){
        this.name = name ;
    }

    @Override
    public void update(String content) {
        System.out.println(this.name+"收到订阅杂志信息："+content);
    }
}
