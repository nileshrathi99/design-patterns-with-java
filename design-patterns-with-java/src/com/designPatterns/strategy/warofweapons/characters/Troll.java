package com.designPatterns.strategy.warofweapons.characters;

import com.designPatterns.strategy.warofweapons.behaviours.food.FoodSteak;
import com.designPatterns.strategy.warofweapons.behaviours.weapon.WeaponAxe;

public class Troll extends Character{

    public Troll(){
        weaponBehaviour = new WeaponAxe();
        foodBehaviour = new FoodSteak();
    }

    @Override
    public void display() {
        System.out.println("I am Troll");
    }
}
