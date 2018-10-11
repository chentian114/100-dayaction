package com.chen.dayaction.designpattern.command6.group;

/**
 * Created by ChenTian on 2018/10/11.
 */
public abstract class Command {
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();
}
