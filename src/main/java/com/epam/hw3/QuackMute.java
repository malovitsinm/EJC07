package com.epam.hw3;

public class QuackMute implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Awkward silence...>>");
    }
}
