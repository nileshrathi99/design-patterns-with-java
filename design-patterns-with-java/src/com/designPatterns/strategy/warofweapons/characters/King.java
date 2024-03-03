package com.designPatterns.strategy.warofweapons.characters;

import com.designPatterns.strategy.warofweapons.behaviours.food.FoodSteak;
import com.designPatterns.strategy.warofweapons.behaviours.weapon.WeaponKnife;

public class King extends Character{

    public King(){
        weaponBehaviour = new WeaponKnife();
        foodBehaviour = new FoodSteak();
    }

    @Override
    public void display() {
        System.out.println("I am King");
    }
}
