package com.company1.patterns.strategy.fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
