package com.designPatterns.decorator.chipotlay.bases;

import com.designPatterns.decorator.chipotlay.Base;

public class Bowl extends Base {

    public Bowl(){
        this.description = "Bowl";
    }

    @Override
    public double getCost() {
        return 3;
    }
}
