package com.epam.hw3;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Is it a real duck? Psych! That's just a decoy!");
    }

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackMute();
    }
}
