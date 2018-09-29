package com.chen.dayaction.designpattern.command6.remote;

public class LightOffCommand implements Command {
    private Receiver receiver ;
    public LightOffCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void cancel() {
        receiver.on();
    }

}
