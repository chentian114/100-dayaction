package com.chen.dayaction.designpattern.command6;

import com.chen.dayaction.designpattern.command6.player.*;

/**
 * 盒式收音机案例：
 * 　用户有一个盒式录音机，此录音机有播音(Play)、倒带(Rewind)和停止(Stop)功能。
 * 案例分析：录音机的键盘便是请求者(Invoker)角色；客户是客户端角色，而录音机便是接收者角色。
 * Command类扮演抽象命令角色，而PlayCommand、StopCommand和RewindCommand便是具体命令类。
 * 用户不需要知道播音(play)、倒带(rewind)和停止(stop)功能是怎么具体执行的，这些命令执行的细节全都由键盘(Keypad)具体实施。
 * 用户只需要在键盘上按下相应的键便可以了。
 *
 * 所谓宏命令简单点说就是包含多个命令的命令，是一个命令的组合。
 *
 * 命令模式：把一个请求或者操作封装到一个对象中。命令模式允许系统使用不同的请求把客户参数化，对请求排队
 *  或者记录请求日志，可以提供命令的撤销功能。
 * 命令模式把请求的发送者和请求的执行分割开，委派给不同的对象。
 * 命令模式的优点：1）使得新的命令很容易加入到系统中2）能容易的设计一个命令队列3）可以容易实现撤销4）可以容易地将命令记入日志
 * 客户端：创建一个具体的命令。请求者：负责调用命令对象执行请求。接收者：负责具体实施和执行一个请求。
 * 命令模式优点：
 * 1）更松散的耦合，将发起命令的客户端与具体处理命令的接收者完全解耦，客户端完全不知道接收者是什么样子。
 * 2）更动态的控制，把请求封装起来，可以动态的对请求进行参数化、队列化和日志化等，使系统更灵活。
 * 3）复合命令，很容易的组合命令，即宏命令，使系统功能更强大。
 * 4）更好的扩展，很容易添加新的命令。
 *
 *
 */
public class AudioPlayerDemo {
    public static void main(String[] args) {
        KeyPad keyPad = new KeyPad();

        AudioPlayer audioPlayer = new AudioPlayer();
        PlayCommand playCommand = new PlayCommand(audioPlayer);
        keyPad.setPlayCommand(playCommand);

        StopCommand stopCommand = new StopCommand(audioPlayer);
        keyPad.setStopCommand(stopCommand);

        RewindCommand rewindCommand = new RewindCommand(audioPlayer);
        keyPad.setRewindCommnad(rewindCommand);

        keyPad.pushPlayCommand();
        keyPad.pushStopCommand();
        keyPad.pushRewindCommand();
        System.out.println("==================================");
        ComplexCommand complexCommand = new ComplexCommand();
        complexCommand.add(playCommand);
        complexCommand.add(stopCommand);
        complexCommand.add(rewindCommand);
        complexCommand.add(playCommand);
        keyPad.setComplexCommand(complexCommand);

        keyPad.pushComplexCommand();
    }
}
