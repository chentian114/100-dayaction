package com.chen.dayaction.designpattern.command6;

import com.chen.dayaction.designpattern.command6.remote.*;

/**
 * 遥控器案例：
 * 一个遥控器有多个按钮，每对按钮控制一个电器的开和关，以及支持撤销操作。并希望能够提供扩展。
 */
public class RemoteControlDemo {
    public static void main(String[] args) {
        SimpleRemoteControl control = new SimpleRemoteControl();
        Light light = new Light();
        control.setCommand(0,new LightOnCommand(light),new LightOffCommand(light));

        control.onButtonPush(0);
        control.offButtonPush(0);
        System.out.println("=================");
        control.onButtonPush(0);
        Command command = control.getOnCommands(0);
        control.cancelButtonPush(command);
    }
}
