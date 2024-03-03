package com.designPatterns.strategy.warofweapons.behaviours.food;

public class FoodPizza implements FoodBehaviour{
    @Override
    public void eat() {
        System.out.println("I eat Pizza");
    }
}
