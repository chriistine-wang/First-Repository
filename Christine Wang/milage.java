
/**
 * Christine Wang, Mae Binkowski
 * 8/23/22
 * Milage pair assignment
 * -------------------------------
 * Prints which fraction of your car's use is for commuting to work & personal use after reading input from user
 * -------------------------------
 * Who helped me: Mr. Hayes, Mae
 */

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class milage
{
    /**
     * main method
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
                
        double milesTravelled;
        double ending_miles;
        double beginning_miles;
        double workFraction;
        double personalFraction;
        
        double totalDays;
        double onewayDistance = 5;
        
        // input from user: beginning and ending milage, number of work days

        System.out.println ("This will calculate what fraction of your car's use is for commuting to work & personal use.");

        System.out.println ("Please enter the number of days you spent using your car: ");
        totalDays = keyboard.nextDouble();
        
        System.out.println ("Please enter the number of in those " + totalDays + " days you spent commuting for work.");
        double workDays = keyboard.nextDouble();
        
        double workMiles = workDays * onewayDistance * 2;
        
        System.out.println ("Please enter the amount of miles you started with: ");
        beginning_miles = keyboard.nextDouble();
        
        System.out.println ("Please enter the amount of miles you ended with: ");
        ending_miles = keyboard.nextDouble();
        
        // Computes the percentage
        
        milesTravelled = ending_miles - beginning_miles;
        
        NumberFormat percent = NumberFormat.getPercentInstance();
        workFraction = workMiles / milesTravelled;
        
        personalFraction = 1 - workFraction;
        
        System.out.printf("Work Fraction: %-5s \t Personal Fraction:%-5s \n", (percent.format(workFraction)), (percent.format(personalFraction)));
        
        
        

        
        

        
        
    
        
        
        
        
    }
}
// 
        // Calculate: workMiles = work days * one-way-distance * 2
        // Calculate: milesTravelled = ending miles - beginning miles
        // Calculate: workFraction = workMiles / milesTravelled
        // Calculate: personalFraction = 1 - workFraction
