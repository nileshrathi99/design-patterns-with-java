package com.designPatterns.decorator.starbuzz.condiments;

import com.designPatterns.decorator.starbuzz.Beverage;
import com.designPatterns.decorator.starbuzz.CondimentDecorator;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage b){
        this.beverage = b;
    }

    @Override
    public double getCost() {
        return 0.1 + this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }
}
