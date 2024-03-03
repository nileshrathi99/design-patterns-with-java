package com.designPatterns.decorator.starbuzz.beverages;

import com.designPatterns.decorator.starbuzz.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        this.description = "Dark Roast Coffee";
    }

    @Override
    public double getCost() {
        return 0.3;
    }
}
