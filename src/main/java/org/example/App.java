/*
 *  UCF COP3330 Fall 2021 Assignment 1.6 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;
import java.util.*;

public class App {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is your current age? "); //Asking for user input
        int age1 = x.nextInt(); //Storing user input
        System.out.print("At what age would you like to retire? ");
        int age2 = x.nextInt();
        int retireage = age2 - age1; //Doing math to find years till retire

        Calendar cal = Calendar.getInstance(); //Getting calendar
        int year = cal.get(Calendar.YEAR); //Calling for calendar year
        int year_retire = year + retireage; //Finding year to retire

        System.out.printf("You have %d years left until you can retire.\n", retireage);
        System.out.printf("It's %d, so you can retire in %d.\n", year, year_retire);

    }
}