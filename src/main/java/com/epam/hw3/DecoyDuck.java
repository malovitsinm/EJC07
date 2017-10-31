package com.epam.hw3;

import com.epam.hw3.dao.impl.FightNoWay;
import com.epam.hw3.dao.impl.FlyNoWay;
import com.epam.hw3.dao.impl.QuackMute;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Is it a real duck? Psych! That's just a decoy!");
    }

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackMute();
        fightBehavior = new FightNoWay();
    }
}
