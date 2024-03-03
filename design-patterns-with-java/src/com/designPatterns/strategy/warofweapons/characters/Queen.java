package com.designPatterns.strategy.warofweapons.characters;

import com.designPatterns.strategy.warofweapons.behaviours.food.FoodPizza;
import com.designPatterns.strategy.warofweapons.behaviours.weapon.WeaponAxe;

public class Queen extends Character{

    public Queen(){
        weaponBehaviour = new WeaponAxe();
        foodBehaviour = new FoodPizza();
    }

    @Override
    public void display() {
        System.out.println("I am Queen");
    }
}
