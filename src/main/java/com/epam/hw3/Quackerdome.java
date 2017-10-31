package com.epam.hw3;

import com.epam.hw3.dao.FightBehavior;
import com.epam.hw3.dao.FlyBehavior;
import com.epam.hw3.dao.QuackBehavior;
import com.epam.hw3.dao.impl.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Quackerdome {
    Duck duckInRedShorts;
    Duck duckInBlueShorts;

    public Quackerdome(Duck duckInRedShorts, Duck duckInBlueShorts) {
        this.duckInRedShorts = generateADuckFighter(duckInRedShorts);
        this.duckInBlueShorts = generateADuckFighter(duckInBlueShorts);
    }

    public void displayContestants(){
        System.out.println("In the red shorts, the color of a bloody carnage:");
        System.out.print("\t");
        duckInRedShorts.display();
        System.out.println("In the blue shorts, the color of a tranquil warrior:");
        System.out.print("\t");
        duckInBlueShorts.display();
    }

    public void beginSlaughter(){
        switch(compareFightingStyles(duckInBlueShorts, duckInRedShorts)){
            case -1:
                System.out.println("The DuckInBlueShorts lies dead on the surface of the bloody pond. " +
                        "The DuckInTheRedShorts emerges a victor!");
                System.out.println("It unleashes an victorious quack:");
                duckInRedShorts.performQuack();
                System.out.println("And flies away:");
                duckInRedShorts.performFly();
                break;
            case 0:
                System.out.println("It's a ... draw!? I guess no one leaves Quackerdome today.");
                break;
            case 1:
                System.out.println("The DuckInRedShorts lies dead on the surface of bloody pond. " +
                        "The DuckInTheBlueShorts emerges victorious!");
                System.out.println("It unleashes an victorious quack:");
                duckInBlueShorts.performQuack();
                System.out.println("And flies away:");
                duckInBlueShorts.performFly();
                break;
        }
    }

    public int compareFightingStyles(Duck defender,Duck attacker){
        if(defender.getFightBehavior() instanceof FightNoWay || attacker.getFightBehavior() instanceof  FightNoWay){
            if(defender.getFightBehavior() instanceof  FightNoWay
                    && attacker.getFightBehavior() instanceof  FightNoWay){
                return 0;
            }
            else if(attacker.getFightBehavior() instanceof  FightNoWay){
                return 1;
            }else{
                return -1;
            }
        }
        if(attacker.getFightBehavior() instanceof  FightNoWay){
            if(defender.getFightBehavior() instanceof  FightNoWay){
                return 0;
            }else{
                return -1;
            }
        }
        else if(defender.getFightBehavior() instanceof FightFairly){
            if (attacker.getFightBehavior() instanceof FightCunningly){ return -1;}
            else if (attacker.getFightBehavior() instanceof FightSmart){ return 1;}
            else if (attacker.getFightBehavior() instanceof  FightFairly){ return 0;}
        }
        else if(defender.getFightBehavior() instanceof FightSmart){
            if (attacker.getFightBehavior() instanceof FightCunningly){ return 1;}
            else if (attacker.getFightBehavior() instanceof FightSmart){ return 0;}
            else if (attacker.getFightBehavior() instanceof  FightFairly){ return -1;}
        }
        else if(defender.getFightBehavior()  instanceof FightCunningly){
            if (attacker.getFightBehavior() instanceof FightCunningly){ return 0;}
            else if (attacker.getFightBehavior() instanceof FightSmart){ return -1;}
            else if (attacker.getFightBehavior() instanceof  FightFairly){ return 1;}
        }
        throw new IllegalArgumentException("The duck recived was not a duck");
    }

    public Duck generateADuckFighter(Duck fighter){
        if(fighter instanceof ModelDuck != true){
            return fighter;
        }
        List<FlyBehavior> howToFlyList = new ArrayList<>();
        howToFlyList.add(new FlyWithWings());
        howToFlyList.add(new FlyNoWay());

        List<FightBehavior> howToFightList = new ArrayList<>();
        howToFightList.add(new FightCunningly());
        howToFightList.add(new FightFairly());
        howToFightList.add(new FightSmart());
        howToFightList.add(new FightNoWay());

        List<QuackBehavior> howToQuackList = new ArrayList<>();
        howToQuackList.add(new Quack());
        howToQuackList.add(new QuackMute());
        howToQuackList.add(new Squeck());

        Random randomGenerator = new Random();
        int[] duckSignature = {randomGenerator.nextInt(2),
                randomGenerator.nextInt(4),
                randomGenerator.nextInt(3)};

        fighter.setFlyBehavior(howToFlyList.get(duckSignature[0]));
        fighter.setFightBehavior(howToFightList.get(duckSignature[1]));
        fighter.setQuackBehavior(howToQuackList.get(duckSignature[2]));
        return fighter;
    }
}
