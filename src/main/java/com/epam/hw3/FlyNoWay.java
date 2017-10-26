package com.epam.hw3;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck ain't gonna fly!");
    }
}
