package com.designPatterns.strategy.warofweapons.behaviours.food;

public class FoodSteak implements FoodBehaviour{
    @Override
    public void eat() {
        System.out.println("I eat steak");
    }
}
