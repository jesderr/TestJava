package com.company1.patterns.decorator.beverage;

import com.company1.patterns.decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        //description = "Espresso";
        //TODO : SWAP private in beverage on public
        this.setDescription("Espresso");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
