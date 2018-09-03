package com.chen.dayaction.designpattern.decorator3.hero;

public class Skills_W extends Skills {
    public Skills_W(Hero hero) {
        super(hero);
    }

    @Override
    public void learnSkills() {
        super.learnSkills();
        System.out.println("学习技能W");
    }
}
