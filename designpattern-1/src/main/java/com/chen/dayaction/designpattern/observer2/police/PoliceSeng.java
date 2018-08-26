package com.chen.dayaction.designpattern.observer2.police;

public class PoliceSeng implements Observer {
    private String name;
    public PoliceSeng(){
        this.name = "【警察】扫地僧：";
    }
    @Override
    public void update(String activity) {
        System.out.println(this.name+"查探到嫌犯消息："+activity);
    }
}
