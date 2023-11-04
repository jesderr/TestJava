package com.company1.patterns.decorator.beverage;

import com.company1.patterns.decorator.Beverage;

public class DarkRoast extends Beverage{
    public DarkRoast() {
        //description = "Dark Roast Coffee";
        //TODO : SWAP private in beverage on public
        this.setDescription("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return .99;
    }
}
