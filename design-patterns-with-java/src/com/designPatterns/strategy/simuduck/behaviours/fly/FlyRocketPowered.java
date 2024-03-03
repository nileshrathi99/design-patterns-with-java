package com.designPatterns.strategy.simuduck.behaviours.fly;

public class FlyRocketPowered implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I am flying with rocket");
    }
}
