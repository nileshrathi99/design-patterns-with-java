package com.designPatterns.strategy.warofweapons;

import com.designPatterns.strategy.warofweapons.behaviours.food.FoodBread;
import com.designPatterns.strategy.warofweapons.behaviours.weapon.WeaponSword;
import com.designPatterns.strategy.warofweapons.characters.Character;
import com.designPatterns.strategy.warofweapons.characters.King;

public class WarSimulator {

    public static void main(String[] args){

        Character king = new King();
        king.fight();
        king.setWeaponBehaviour(new WeaponSword());
        king.fight();
        king.eat();
        king.setFoodBehaviour(new FoodBread());
        king.eat();
    }
}
