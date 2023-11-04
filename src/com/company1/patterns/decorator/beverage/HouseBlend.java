package com.company1.patterns.decorator.beverage;

import com.company1.patterns.decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        //description = "House Blend Coffee";
        //TODO : SWAP private in beverage on public
        this.setDescription("House Blend Coffee");
    }

    @Override
    public double cost() {
        return .89;
    }
}
