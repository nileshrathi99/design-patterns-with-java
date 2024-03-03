package com.designPatterns.strategy.simuduck.behaviours.quack;

public class Squeak implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
