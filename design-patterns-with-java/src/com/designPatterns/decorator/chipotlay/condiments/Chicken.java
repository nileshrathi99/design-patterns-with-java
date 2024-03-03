package com.designPatterns.decorator.chipotlay.condiments;

import com.designPatterns.decorator.chipotlay.Base;
import com.designPatterns.decorator.chipotlay.CondimentDecorator;

public class Chicken extends CondimentDecorator {

    private Base base;

    public Chicken(Base b){
        this.base = b;
    }

    @Override
    public double getCost() {
        return 0.3 + this.base.getCost();
    }

    @Override
    public String getDescription() {
        return this.base.getDescription() + ", Chicken";
    }
}
