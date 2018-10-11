package com.chen.dayaction.designpattern.command6.group;

/**
 * Created by ChenTian on 2018/10/11.
 */
public class Invoker {
    private Command command;
    public void setCommand(Command command){
        System.out.println("项目组长收到需求！");
        this.command = command;
    }

    public void action(){
        System.out.println("项目组长分配任务！");
        command.execute();
    }
}
