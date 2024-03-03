package com.designPatterns.strategy.warofweapons.behaviours.food;

public class FoodBread implements FoodBehaviour{

    @Override
    public void eat() {
        System.out.println("I eat Bread");
    }
}
