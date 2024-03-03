package com.designPatterns.strategy.simuduck.behaviours.quack;

public class Quack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
