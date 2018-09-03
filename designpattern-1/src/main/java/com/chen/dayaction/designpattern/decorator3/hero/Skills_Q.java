package com.chen.dayaction.designpattern.decorator3.hero;

public class Skills_Q extends Skills {
    public Skills_Q(Hero hero) {
        super(hero);
    }

    @Override
    public void learnSkills() {
        super.learnSkills();
        System.out.println("学习技能Q");
    }
}
