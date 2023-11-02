package com.company1.patterns.strategy;

import com.company1.patterns.strategy.fly.FlyNoWay;
import com.company1.patterns.strategy.quack.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
