package com.chen.dayaction.designpattern.command6.group;

/**
 * Created by ChenTian on 2018/10/11.
 */
public class DeletePageCommand extends Command {
    @Override
    public void execute() {
        super.rg.delRequirementPage();
        super.cg.delRequirementPage();
    }
}
