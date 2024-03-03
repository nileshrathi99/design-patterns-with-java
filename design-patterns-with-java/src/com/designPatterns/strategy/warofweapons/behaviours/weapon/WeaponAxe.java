package com.designPatterns.strategy.warofweapons.behaviours.weapon;

public class WeaponAxe implements WeaponBehaviour{
    @Override
    public void useWeapon() {
        System.out.println("I fight with an Axe");
    }
}
