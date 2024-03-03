package com.designPatterns.strategy.simuduck.ducks;

import com.designPatterns.strategy.simuduck.behaviours.fly.FlyWithWings;
import com.designPatterns.strategy.simuduck.behaviours.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am real Mallard Duck");
    }
}
