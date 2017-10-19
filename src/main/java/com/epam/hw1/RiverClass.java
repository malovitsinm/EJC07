package com.epam.hw1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public final class RiverClass {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a number of the Mississippi rivers:\n (More than 2, duh!)");
        String param = reader.readLine();

        int value = Integer.parseInt(param);
        if (value < 2){
            System.out.println("Oh boy, you can't read, don't you?");
        } else if (value > 2 && value < 153) {
            for (int i = 1; i < value + 1; i++) {
                System.out.println("Mississippi " + i + "!");
            }
        } else {
            System.out.println("This number is beyond me!");
        }
    }
}
