package com.epam.l8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public String[] monthsOFTheYear = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"};


    public boolean isNumber(String parameter){
        return parameter.matches("\\d+");
    }

    public int parseIntFromString(String parameter){
        if(isNumber(parameter)){
            return Integer.parseInt(parameter);
        }

        throw new IllegalArgumentException("User input is not an positive integer. Received parameter is: " + parameter);

    }

    public String getMonthByNumber(String userInput){
        int monthIndex = parseIntFromString(userInput);
        if(monthIndex>=1 && monthIndex<=12){
            return monthsOFTheYear[monthIndex-1];
        }
        throw new IndexOutOfBoundsException("Received number does not located in month number range");
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Please enter a number associated with a month of the year\n");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(main.getMonthByNumber(reader.readLine()));
        } catch (IOException e){
            e.printStackTrace();
        }
    }


}