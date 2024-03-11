package com.designPatterns.strategy.simuduck.ducks;

import com.designPatterns.strategy.simuduck.behaviours.fly.FlyNoWay;
import com.designPatterns.strategy.simuduck.behaviours.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a Model Duck");
    }

}
