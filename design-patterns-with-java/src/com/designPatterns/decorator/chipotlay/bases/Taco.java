package com.designPatterns.decorator.chipotlay.bases;

import com.designPatterns.decorator.chipotlay.Base;

public class Taco extends Base {

    public Taco(){
        this.description = "Taco";
    }

    @Override
    public double getCost() {
        return 4;
    }
}
