package com.chen.dayaction.designpattern.command6.player;

public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("nothing!");
    }
}
