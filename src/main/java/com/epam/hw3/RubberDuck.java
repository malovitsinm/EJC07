package com.epam.hw3;

import com.epam.hw3.dao.impl.FightNoWay;
import com.epam.hw3.dao.impl.FlyNoWay;
import com.epam.hw3.dao.impl.Squeck;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("You see a cute yellow rubber duck!");
    }

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeck();
        fightBehavior = new FightNoWay();
    }
}
