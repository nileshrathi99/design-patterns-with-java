package com.designPatterns.decorator.starbuzz;

public abstract class Beverage {

    public String description;

    public String getDescription(){
        return this.description;
    }

    public abstract double getCost();
}
