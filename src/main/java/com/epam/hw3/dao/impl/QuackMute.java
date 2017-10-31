package com.epam.hw3.dao.impl;

import com.epam.hw3.dao.QuackBehavior;

public class QuackMute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Awkward silence...>>");
    }
}
