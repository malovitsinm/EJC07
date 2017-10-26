package com.epam.hw3;

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
    }

    private static void displayBreakLine(){
        System.out.println("=======================");
    }

}
