package com.chen.dayaction.designpattern.facade8.theater;

/**
 * Created by ChenTian on 2018/10/18.
 */
public class Dvd {
    public void on(){
        System.out.println("打开DVD");
    }

    public void play(String movie){
        System.out.println("播放电影："+movie);
    }
}
