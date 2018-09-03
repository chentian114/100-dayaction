package com.chen.dayaction.designpattern.decorator3;

import com.chen.dayaction.designpattern.decorator3.hero.*;

/**
 * 英雄学习技能案例：英雄李白，随着等级提升能够学习新的技能，包括Q,W,E。
 */
public class HeroDemo {
    public static void main(String[] args) {
        Hero hero = new LiBai();
        hero.learnSkills();

        hero = new Skills_Q(hero);
        hero.learnSkills();

        hero = new Skills_W(hero);
        hero.learnSkills();


        hero = new Skills_E(hero);
        hero.learnSkills();
    }
}
