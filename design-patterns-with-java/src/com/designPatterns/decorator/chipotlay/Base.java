package com.designPatterns.decorator.chipotlay;

public abstract class Base {

    protected String description;

    public String getDescription(){
        return this.description;
    }

    public abstract double getCost();
}
