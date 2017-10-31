package com.epam.hw3;

import com.epam.hw3.dao.FightBehavior;
import com.epam.hw3.dao.FlyBehavior;
import com.epam.hw3.dao.QuackBehavior;
import com.epam.hw3.dao.impl.FightFairly;
import com.epam.hw3.dao.impl.FlyNoWay;
import com.epam.hw3.dao.impl.QuackMute;

public class ModelDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am a Model Duck...MY BODY IS SHIFTING! WHY DID GOD LEFT ME UNFINISHED?");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new QuackMute();
        fightBehavior = new FightFairly();
    }

    public ModelDuck(FlyBehavior flyImpl, QuackBehavior quackImpl, FightBehavior fightImpl)
    {
        fightBehavior = fightImpl;
        flyBehavior = flyImpl;
        quackBehavior = quackImpl;
    }



}
