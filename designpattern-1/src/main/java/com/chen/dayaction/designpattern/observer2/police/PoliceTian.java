package com.chen.dayaction.designpattern.observer2.police;

public class PoliceTian implements Observer {
    private String name ;
    public PoliceTian(){
        this.name = "【警察】石破天，";
    }


    @Override
    public void update(String activity) {
        System.out.println(this.name+"查探到嫌犯消息："+activity);
    }
}
