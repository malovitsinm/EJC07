package com.epam.hw3;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("You see a cute yellow rubber duck!");
    }

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeck();
    }
}
