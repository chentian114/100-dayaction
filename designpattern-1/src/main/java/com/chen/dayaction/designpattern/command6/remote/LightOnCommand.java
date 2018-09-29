package com.chen.dayaction.designpattern.command6.remote;

public class LightOnCommand implements Command {
    private Receiver receiver;
    public LightOnCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void cancel() {
        receiver.off();
    }


}
