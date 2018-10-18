package com.chen.dayaction.designpattern.facade8.theater;

/**
 * Created by ChenTian on 2018/10/18.
 */
public class Amp {
    public void on(){
        System.out.println("打开音响");
    }

    public void setDvd(){
        System.out.println("设置DVD");
    }

    public void setSurroundSound(){
        System.out.println("设置立体声");
    }

    public void setVolume(int vol){
        System.out.println("设置音量："+vol);
    }
}
