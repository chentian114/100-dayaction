package com.chen.dayaction.designpattern.command6.player;

public class StopCommand implements Command {
    private AudioPlayer audioPlayer;
    public StopCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }
    @Override
    public void execute() {
        audioPlayer.stop();
    }
}
