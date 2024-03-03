package com.designPatterns.strategy.simuduck.ducks;

import com.designPatterns.strategy.simuduck.behaviours.fly.FlyBehaviour;
import com.designPatterns.strategy.simuduck.behaviours.quack.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(){
    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour fb){
        flyBehaviour = fb;
    }

    public void setQuackBehaviour(QuackBehaviour qb){
        quackBehaviour = qb;
    }

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

}
