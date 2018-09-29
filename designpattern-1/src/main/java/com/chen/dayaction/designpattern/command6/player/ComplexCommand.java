package com.chen.dayaction.designpattern.command6.player;

import java.util.ArrayList;
import java.util.List;

public class ComplexCommand implements Command{
    private List<Command> complexCommands = new ArrayList<>();

    public void add(Command command){
        complexCommands.add(command);
    }
    public void remove(Command command){
        complexCommands.remove(command);
    }

    @Override
    public void execute() {
        for (Command command : complexCommands){
            command.execute();
        }
    }
}
