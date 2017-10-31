package com.epam.hw3.dao.impl;

import com.epam.hw3.dao.FightBehavior;

public class FightCunningly implements FightBehavior {
    @Override
    public void fight() {
        System.out.println("A cunning attack! A trick as dirty as effective.");
    }
}
