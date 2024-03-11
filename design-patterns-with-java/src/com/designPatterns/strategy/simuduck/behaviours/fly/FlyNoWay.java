package com.designPatterns.strategy.simuduck.behaviours.fly;

public class FlyNoWay implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
