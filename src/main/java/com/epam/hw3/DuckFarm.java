package com.epam.hw3;

import com.epam.hw3.dao.impl.Quack;

public class DuckFarm {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();
        Duck modelDuck = new ModelDuck();

        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        displayBreakLine();

        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        displayBreakLine();

        decoyDuck.display();
        decoyDuck.swim();
        decoyDuck.performQuack();
        decoyDuck.performFly();

        displayBreakLine();

        System.out.println("And now, for my next trick...");
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.setQuackBehavior(new Quack());
        modelDuck.performQuack();
        System.out.println("Ta-da!");

        displayBreakLine();
        System.out.println("Welcome to the Quackerdome! Two ducks are modeled on enter " +
                "- one duck leaves in it's glory!\nTake a look at ours today's contestants:");
        Duck duckInBlueShorts = new ModelDuck();
        Duck duckInRedShorts = new RubberDuck();
        Quackerdome quackerdome = new Quackerdome(duckInRedShorts, duckInBlueShorts);
        quackerdome.displayContestants();

        System.out.println("Through forbidden ways of ducktomancy we are altering every model duck in this contest!");
        System.out.println("And now the fight begins!");
        System.out.println("The DuckInBlueShorts attacks:");

        System.out.print("\t");
        duckInBlueShorts.performFight();
        System.out.println("The DuckInRedShorts attacks:");
        System.out.print("\t");
        duckInRedShorts.performFight();

        quackerdome.beginSlaughter();
    }

    private static void displayBreakLine(){
        System.out.println("=======================");
    }

}
