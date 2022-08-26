
/**
 * Christine Wang
 * 8/23/22
 * Notes for Ch. 1
 * Write a description where we are going to take some code notes
 * Who helped me: Mr. Hayes, 
 */

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class chapter1Notes
{
    /**
     * main method
     * where we are going to code
     */
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        
        //these are the basic data types
        int x=9,y,z;
        double num = 5, num1 = 23.4567, num2;
        char letter = 'd';
        boolean choice = false;
        float anum = 7;
        long a = 9;
        short b = 5;
        
        // change numbers in variable to test difference
        // the difference between the two: 0's pads it with zeros. #'s does not, only rounds
        DecimalFormat fmt = new DecimalFormat("0.##");
        DecimalFormat fmt2 = new DecimalFormat("0.00");
        
        NumberFormat money = NumberFormat.getCurrencyInstance(); // calls upon a method, constructor called BTS
        NumberFormat percent = NumberFormat.getPercentInstance(); // percentage of a whole number (2 = 200%, 23.45 = 2345%)
        
        
        System.out.println (fmt.format(num1));
        System.out.println (fmt2.format(num1));
        
        System.out.println (money.format(num1));
        System.out.println (percent.format(num1));

        
        
        
        //These are objects!
        
        //   class      identifier (name)      memory    constructor (how much memory do you need?)
             String      word                  = new       String("Kevin Hayes");
             Integer     number                = new       Integer(47);
        Double number2 = new Double(34.5);
        
        String word2 = new String("Homer Simpson");
        String word3 = new String("Bart Simpson");
        String name = new String("Mike");
        String name2 = new String("Homer Simpson");
        String name3 = new String("Bob");

        String last = "Hayes";

        int id = 85027;
        int id2 = 4503;
        int id3 = 60439;
        
        // -----------
        // printf

        // "-" aligns it to the left
        // "15" in 15s inputs amount of characters spaced
        // %#d amount of digits in column. can overflow
        
        System.out.printf("Name:  %-15s \t ID: %7d \t GPA: %-7.3f \n", name, id, 4.22395);
        System.out.printf("Name:  %-15s \t ID: %7d \t GPA: %-7.3f\n", name2, id2, 3.8);
        
        // spacing between literals affect printed out spacing.
        // number before conversion characters starts affecting the spacing after input is outputted
        // width = min. number of spaces taken up by output
        System.out.printf("Name:       %-15S \t ID: %1d\n", name, id);
        System.out.printf("Name:  %-15s \t ID: %5d \t GPA: %-,8.3f\n", name, id, 4.22395);
        System.out.printf("Name:  %-15s \t ID: %5d \t GPA: %-7.9f\n", name, id, 4.22395); // number after decimal determines amount of spaces taken up. replaces w/ 0's if empty.
        System.out.printf("Name:  %-15s \t ID: %5d \t GPA: %-1.9f\n", name, id, 4.22395); // but what does the number before decimal do?

        // chars
        
        System.out.println( 'a' + 100 ); // char also = single digit numbers, corresponds to ACII keyboard
        System.out.println('a'   );
        System.out.println("A"+100  );
        
        // Calculate: workMiles = work days * one-way-distance * 2
        // Calculate: milesTravelled = ending miles - beginning miles
        // Calculate: workFraction = workMiles / milesTravelled
        // Calculate: personalFraction = 1 - workFraction
        
    }
}
