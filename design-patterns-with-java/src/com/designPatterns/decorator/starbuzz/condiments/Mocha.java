package com.designPatterns.decorator.starbuzz.condiments;

import com.designPatterns.decorator.starbuzz.Beverage;
import com.designPatterns.decorator.starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage b){
        this.beverage = b;
    }

    @Override
    public double getCost() {
        return 0.15 + this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }
}
