package com.chen.dayaction.designpattern.decorator3.hero;

public class Skills implements Hero {
    private Hero hero;
    public Skills(Hero hero){
        this.hero = hero;
    }

    public void learnSkills() {
        this.hero.learnSkills();
    }
}
