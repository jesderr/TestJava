package com.company1.patterns.strategy.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying.");
    }
}
