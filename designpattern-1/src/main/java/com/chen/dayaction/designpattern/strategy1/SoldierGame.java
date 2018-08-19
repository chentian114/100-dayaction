package com.chen.dayaction.designpattern.strategy1;

import com.chen.dayaction.designpattern.strategy1.soldier.Gun;
import com.chen.dayaction.designpattern.strategy1.soldier.Pistol;
import com.chen.dayaction.designpattern.strategy1.soldier.Rifle;

/**
 * 士兵射击游戏案例：士兵使用各种枪支射击
 * OO原则：对扩展开放，对修改关闭。方便新增射击方式
 */
public class SoldierGame {
    private Gun gun;

    public SoldierGame(Gun gun){
        this.gun = gun;
    }
    public void setGun(Gun gun){
        this.gun = gun;
    }
    public void shoot(){
        gun.fire();
    }

    public static void main(String[] args) {
        SoldierGame soldierGame = new SoldierGame(new Rifle());
        System.out.print("士兵游戏：");
        soldierGame.shoot();

        soldierGame.setGun(new Pistol());
        System.out.print("士兵游戏：");
        soldierGame.shoot();

    }
}

