package com.chen.dayaction.designpattern.command6.remote;

public class SimpleRemoteControl {
    private final int MAX_SIZE = 7 ;
    private Command[] onCommands= new Command[MAX_SIZE];
    private Command[] offCommands= new Command[MAX_SIZE];

    public SimpleRemoteControl(){
        for (int i=0; i<MAX_SIZE ; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        if (checkSlotEffective(slot)){
            return;
        }
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    private boolean checkSlotEffective(int slot) {
        if(slot<0 || slot>=MAX_SIZE){
            return true;
        }
        return false;
    }
    public Command getOnCommands(int slot){
        if (checkSlotEffective(slot)){
            return new NoCommand();
        }
        return onCommands[slot];
    }

    public Command getOffCommands(int slot){
        if (checkSlotEffective(slot)){
            return new NoCommand();
        }
        return offCommands[slot];
    }


    public void onButtonPush(int slot){
        if (checkSlotEffective(slot)){
            return;
        }
        System.out.print("按下打开按钮：");
        onCommands[slot].execute();
    }

    public void offButtonPush(int slot){
        if(checkSlotEffective(slot)){
            return;
        }
        System.out.print("按下关闭按钮：");
        offCommands[slot].execute();
    }

    public void cancelButtonPush(Command command){
        System.out.print("按下撤销按钮：");
        command.cancel();
    }
}
