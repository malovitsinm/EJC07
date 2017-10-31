package com.epam.hw3;

import com.epam.hw3.dao.FightBehavior;
import com.epam.hw3.dao.FlyBehavior;
import com.epam.hw3.dao.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    FightBehavior fightBehavior;

    public Duck() {
    }

    public FightBehavior getFightBehavior() {
        return fightBehavior;
    }

    public void setFightBehavior(FightBehavior fightBehavior) {
        this.fightBehavior = fightBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void swim(){
        System.out.println("All ducks are equal in swimming, I don't wanna be racist or anything!");
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFight(){
        fightBehavior.fight();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public abstract void display();
}
