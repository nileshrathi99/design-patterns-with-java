package com.designPatterns.strategy.ducks;

import com.designPatterns.strategy.behaviours.fly.FlyWithWings;
import com.designPatterns.strategy.behaviours.quack.Quack;

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
