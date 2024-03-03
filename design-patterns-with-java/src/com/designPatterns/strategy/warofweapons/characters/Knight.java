package com.designPatterns.strategy.warofweapons.characters;

import com.designPatterns.strategy.warofweapons.behaviours.food.FoodPizza;
import com.designPatterns.strategy.warofweapons.behaviours.weapon.WeaponSword;

public class Knight extends Character{

    public Knight(){
        weaponBehaviour = new WeaponSword();
        foodBehaviour = new FoodPizza();
    }

    @Override
    public void display() {
        System.out.println("I am Knight");
    }
}
