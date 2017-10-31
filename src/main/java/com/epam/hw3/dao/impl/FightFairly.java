package com.epam.hw3.dao.impl;

import com.epam.hw3.dao.FightBehavior;

public class FightFairly implements FightBehavior {
    @Override
    public void fight() {
        System.out.println("A noble attack! But effective none the less.");
    }
}
