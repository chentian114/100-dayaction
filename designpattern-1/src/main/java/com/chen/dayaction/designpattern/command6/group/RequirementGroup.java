package com.chen.dayaction.designpattern.command6.group;

/**
 * Created by ChenTian on 2018/10/11.
 */
public class RequirementGroup extends Group{
    public void delRequirementPage(){
        System.out.println("需求组：删除一个页面需求！");
    }

    public void addRequirementPage(){
        System.out.println("需求组：新增一个页面需求！");
    }
}
