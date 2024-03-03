package com.designPatterns.strategy.simuduck;

import com.designPatterns.strategy.simuduck.ducks.Duck;
import com.designPatterns.strategy.simuduck.ducks.MallardDuck;
import com.designPatterns.strategy.simuduck.ducks.ModelDuck;
import com.designPatterns.strategy.simuduck.behaviours.fly.FlyRocketPowered;

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
