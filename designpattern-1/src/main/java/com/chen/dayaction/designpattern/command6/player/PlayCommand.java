package com.chen.dayaction.designpattern.command6.player;

public class PlayCommand implements Command {
    private AudioPlayer audioPlayer;
    public PlayCommand(AudioPlayer audioPlayer){
        this.audioPlayer = audioPlayer;
    }
    @Override
    public void execute() {
        audioPlayer.play();
    }
}
