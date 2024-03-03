package com.designPatterns.decorator.starbuzz.beverages;

import com.designPatterns.decorator.starbuzz.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        this.description = "House Blend Coffee";
    }

    @Override
    public double getCost() {
        return 0.85;
    }
}
