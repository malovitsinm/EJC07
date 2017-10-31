package com.epam.hw3.dao.impl;

import com.epam.hw3.dao.FightBehavior;

public class FightNoWay implements FightBehavior {
    @Override
    public void fight() {
        System.out.println("This duck is a pacifist! It won't fight!");
    }
}
