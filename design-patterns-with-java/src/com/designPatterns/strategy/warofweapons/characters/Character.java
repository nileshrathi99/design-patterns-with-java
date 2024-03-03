package com.designPatterns.strategy.warofweapons.characters;

import com.designPatterns.strategy.warofweapons.behaviours.food.FoodBehaviour;
import com.designPatterns.strategy.warofweapons.behaviours.weapon.WeaponBehaviour;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;
    FoodBehaviour foodBehaviour;

    public abstract void display();

    public void fight(){
        weaponBehaviour.useWeapon();
    }

    public void setWeaponBehaviour(WeaponBehaviour wb){
        weaponBehaviour = wb;
    }

    public void eat(){
        foodBehaviour.eat();
    }

    public void setFoodBehaviour(FoodBehaviour fb){
        foodBehaviour = fb;
    }
}
