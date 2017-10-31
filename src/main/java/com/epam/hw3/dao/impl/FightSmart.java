package com.epam.hw3.dao.impl;

import com.epam.hw3.dao.FightBehavior;

public class FightSmart implements FightBehavior {
    @Override
    public void fight() {
        System.out.println("A precise attack countering any subterfuge.");
    }
}
