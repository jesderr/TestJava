package com.company1.patterns.strategy;

import com.company1.patterns.strategy.fly.FlyWithWings;
import com.company1.patterns.strategy.quack.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display(){
        System.out.println("I'm real Mallard duck.");
    }
}
