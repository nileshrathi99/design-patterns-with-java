package com.designPatterns.strategy;

import com.designPatterns.strategy.ducks.Duck;
import com.designPatterns.strategy.ducks.MallardDuck;
import com.designPatterns.strategy.ducks.ModelDuck;
import com.designPatterns.strategy.behaviours.fly.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();

    }
}
