package com.designPatterns.strategy.warofweapons.behaviours.weapon;

public class WeaponKnife implements WeaponBehaviour{

    @Override
    public void useWeapon() {
        System.out.println("I fight with a Knife");
    }
}
