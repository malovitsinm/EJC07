package com.epam.hw3;

import com.epam.hw3.dao.impl.FightNoWay;
import com.epam.hw3.dao.impl.FlyWithWings;
import com.epam.hw3.dao.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        fightBehavior = new FightNoWay();
    }

    @Override
    public void display() {
        System.out.println("This is the mallard duck! Whatever that means... \n" +
                "If only I wasn't lazy enough to actually translate the word \"mallard\"...");
    }
}
