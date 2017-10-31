package com.epam.hw3.dao.impl;

import com.epam.hw3.dao.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
