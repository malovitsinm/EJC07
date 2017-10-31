package com.epam.hw3.dao.impl;

import com.epam.hw3.dao.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck ain't gonna fly!");
    }
}
