package com.chen.dayaction.designpattern.decorator3.hero;

public class LiBai implements Hero {
    private String name ;
    public LiBai(){
        this.name = "李白";
    }

    @Override
    public void learnSkills() {
        System.out.println(this.name+":");
    }
}
