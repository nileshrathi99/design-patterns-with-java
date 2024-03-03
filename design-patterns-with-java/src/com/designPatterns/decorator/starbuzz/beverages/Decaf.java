package com.designPatterns.decorator.starbuzz.beverages;

import com.designPatterns.decorator.starbuzz.Beverage;

public class Decaf extends Beverage {

    public Decaf(){
        this.description = "Decaf Coffee";
    }
    @Override
    public double getCost() {
        return 0.4;
    }
}
