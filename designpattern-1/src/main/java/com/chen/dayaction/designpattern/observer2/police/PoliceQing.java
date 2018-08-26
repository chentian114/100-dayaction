package com.chen.dayaction.designpattern.observer2.police;

public class PoliceQing implements Observer {
    private String name;
    public PoliceQing(){
        this.name="【警察】阿青：";
    }

    @Override
    public void update(String activity) {
        System.out.println(this.name+"查探到嫌犯消息："+activity);
    }
}
