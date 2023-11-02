package com.company1.patterns.strategy.quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
