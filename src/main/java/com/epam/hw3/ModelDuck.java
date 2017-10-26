package com.epam.hw3;

public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a Model Duck...MY BODY IS SHIFTING! WHY DID GOD LEFT ME UNFINISHED?");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackMute();
    }
}
