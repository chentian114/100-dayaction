package com.chen.dayaction.designpattern.command6.player;

public class KeyPad {
    private Command[] commands ;

    public KeyPad(){
        commands = new Command[10];
        for (int i=0 ; i<10 ; i++){
            commands[i] = new NoCommand();
        }
    }

    public void setPlayCommand(Command command){
        commands[0] = command;
    }
    public void pushPlayCommand(){
        commands[0].execute();
    }

    public void setStopCommand(Command command){
        commands[1] = command;
    }
    public void pushStopCommand(){
        commands[1].execute();
    }

    public void setRewindCommnad(Command commnad){
        commands[2] = commnad;
    }
    public void pushRewindCommand(){
        commands[2].execute();
    }

    public void setComplexCommand(Command command){
        commands[3] = command;
    }
    public void pushComplexCommand(){
        commands[3].execute();
    }
}
