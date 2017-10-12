package com.epam.hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrafficLight {
    /**Class for solving "the traffic light problem".
     * <p>See determineLightColor method for more information.</p>
     **/

    public static void main(String[] args) throws IOException {
        System.out.println("Many lights of traffic light cycle before you!\nRound and round they go, when they stop " +
                "nobody knows. Or maybe someone is blessed with this sacred knowledge? \nEnter a number of minutes " +
                "and may be we'll figure it out...");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TrafficLight trafficLight = new TrafficLight();
        int outputValue = trafficLight.determineLightColor(reader);
        if (outputValue > 0) {
            System.out.println("Finished with a correct exit code!");
        } else {
            System.out.println("Finished with an incorrect exit code. There was an error along the way.");
        }
    }

    /**Checks what color of traffic light corresponds with a number inputted.
     * <p>The traffic light is in constant cycle. In follows the following sequence:</p>
     * <p>For every 2 minutes light is red, every 3 minutes after that it is yellow and for every 5 minutes after that it's
     * green. After that cycle closes returning to color red.</p>
     * <p>This method checks user inputted integer for the point of entrance to this cycle</p>
     * @param reader  - Buffer reader for console user input
     * @throws IOException - An error in type of user input
     * @return exitCode - 1 if problem was solved correct or 0 if user input was incorrect,
     * but didn't trew the IOException
     * */

    private int determineLightColor(BufferedReader reader) throws IOException {
        String userInput = reader.readLine();
        int inputValueToInt = Integer.parseInt(userInput);
        int parsedValue = (inputValueToInt % 60) % 10;
        if(parsedValue >= 0 && parsedValue < 2){
            System.out.println("The traffic light is burning in bright red! FOR THE LOVE OF GOD STOP!");
            return 1;
        } else if(parsedValue >= 3 && parsedValue < 5){
            System.out.println("The traffic light is shining with an opportunistic yellow glow. Get ready!");
            return 1;
        } else if(parsedValue >= 5 && parsedValue < 10){
            System.out.println("The traffic light is lit with a calming green light. You can go now.");
            return 1;
        } else {
            System.out.println("Woah! Was that even minutes you typed in?! Sorry mate, I didn't get any of that.");
            return 0;
        }
    }
}
