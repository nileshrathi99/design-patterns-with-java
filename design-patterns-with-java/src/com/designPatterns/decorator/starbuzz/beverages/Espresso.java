package com.designPatterns.decorator.starbuzz.beverages;

import com.designPatterns.decorator.starbuzz.Beverage;

public class Espresso extends Beverage {

    public Espresso(){
        this.description = "Espresso Coffee";
    }
    @Override
    public double getCost() {
        return 0.8;
    }
}
