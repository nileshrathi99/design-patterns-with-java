package com.designPatterns.decorator.starbuzz;

import com.designPatterns.decorator.starbuzz.beverages.DarkRoast;
import com.designPatterns.decorator.starbuzz.beverages.Espresso;
import com.designPatterns.decorator.starbuzz.condiments.Mocha;
import com.designPatterns.decorator.starbuzz.condiments.Whip;

public class StarbuzzCoffee {

    public static void main(String[] args) {

        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.getCost());

        Beverage beverage1 = new DarkRoast();
        System.out.println(beverage1.getDescription() + " $" + beverage1.getCost());
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.getCost());
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.getCost());


    }
}
