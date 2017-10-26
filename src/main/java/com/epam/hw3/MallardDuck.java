package com.epam.hw3;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("This is the mallard duck! Whatever that means... \n" +
                "If only I wasn't lazy enough to actually translate the word \"mallard\"...");
    }
}
