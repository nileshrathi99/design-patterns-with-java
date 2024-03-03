package com.designPatterns.decorator.chipotlay.bases;

import com.designPatterns.decorator.chipotlay.Base;

public class Burrito extends Base {

    public Burrito(){
        this.description = "Burrito";
    }

    @Override
    public double getCost() {
        return 3;
    }
}
