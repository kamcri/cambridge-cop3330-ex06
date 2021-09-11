/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.time.Year;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
        Scanner ageScan = new Scanner(System.in);
        System.out.println("What is your current age?");
        String age = ageScan.nextLine();

        Scanner retScan = new Scanner(System.in);
        System.out.println("At what age would you like to retire?");
        String ret = retScan.nextLine();

        int year = Year.now().getValue();
        int curAge = Integer.parseInt(age);
        int retAge = Integer.parseInt(ret);

        int yearsLeft = retAge - curAge;
        int retYear = year + yearsLeft;

        if (retAge < curAge)
        {
            System.out.println("You are already able to retire.");
        }
        if (retAge > curAge)
        {
            System.out.println("You have " + yearsLeft + " years left until you can retire.");
            System.out.println("It is " + year + ", you can retire in " + retYear);
        }

        ageScan.close();
        retScan.close();
    }
}
