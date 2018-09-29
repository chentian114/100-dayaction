package com.chen.dayaction.designpattern.command6.player;

public class AudioPlayer {
    public void play(){
        System.out.println("播放...");
    }

    public void stop(){
        System.out.println("停止播放...");
    }

    public void rewind(){
        System.out.println("倒退...");
    }
}
