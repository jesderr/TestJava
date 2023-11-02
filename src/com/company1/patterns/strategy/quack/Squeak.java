package com.company1.patterns.strategy.quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Squeak.");
    }
}
