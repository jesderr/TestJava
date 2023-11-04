package com.company1.patterns.decorator.beverage;

import com.company1.patterns.decorator.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        //description = "Coffee without caffeine";
        //TODO : SWAP private in beverage on public
        this.setDescription("Coffee without caffeine");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
