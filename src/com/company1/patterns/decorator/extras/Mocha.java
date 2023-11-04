package com.company1.patterns.decorator.extras;

import com.company1.patterns.decorator.Beverage;
import com.company1.patterns.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
