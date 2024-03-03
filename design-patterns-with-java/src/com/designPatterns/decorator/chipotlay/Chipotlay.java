package com.designPatterns.decorator.chipotlay;

import com.designPatterns.decorator.chipotlay.bases.Bowl;
import com.designPatterns.decorator.chipotlay.bases.Burrito;
import com.designPatterns.decorator.chipotlay.condiments.Chicken;
import com.designPatterns.decorator.chipotlay.condiments.Fajita;

public class Chipotlay {

    public static void main(String[] args) {

        Base base = new Bowl();
        base = new Fajita(base);
        base = new Chicken(base);
        System.out.println(base.getDescription() + " $" + base.getCost());

    }
}
