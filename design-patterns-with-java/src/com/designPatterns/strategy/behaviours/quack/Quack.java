package com.designPatterns.strategy.behaviours.quack;

public class Quack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
