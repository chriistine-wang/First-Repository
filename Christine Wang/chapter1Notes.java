
/**
 * Christine Wang
 * 8/23/22
 * Notes for Ch. 1
 * Write a description where we are going to take some code notes
 * Who helped me: Mr. Hayes, 
 */

import java.util.Scanner;
import java.text.DecimalFormat;

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
        
        /*
        System.out.println (fmt.format(num1));
        System.out.println (fmt2.format(num1));
        
        System.out.println (money.format(num1));
        System.out.println (percent.format(num1));
        */

        
        
        
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
        
        /*
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

        /**/
        //System.out.print("Enter a Number:");
        System.out.print("Enter 3 Numbers:");
        x = keyboard.nextInt();
        y = keyboard.nextInt();
        z = keyboard.nextInt();

        System.out.print(x+y+z);
        keyboard.nextLine(); // clears the input buffer
        System.out.print(x);
        System.out.print("Enter a Word:");
        word = keyboard.nextLine(); // next reads up \n, to the white space
        word2 = keyboard.next(); // reads to the space
        System.out.print(word);
        System.out.print(word2);
        
        /*
        x = 9;
        double conversion = 5/x; // int result = 0, both integers so it truncates
        final int BASE = 32; // final makes a constant
        int cTemp = 30;
        double fTemp = cTemp + conversion + BASE;
        // double conversion = 5/x(double); is casting
        // double conversion = 5.0/x is promotion 
        
        
        System.out.print("Celsius Temp " + cTemp);
        System.out.print("Fahrenheit EQuivalent " + fTemp);
        */
       
       // below are objects
       /*
       System.out.print(word.length()); // returns in the number of chararcters
       System.out.print(word.toUpperCase()); // change to all upper case
       System.out.print(word.indexOf("E")); // Finds position of letter, starts counting from 0, -1 means its not there
       System.out.print(word.charAt(1));
       System.out.print(word.substring(7)); // whats substring?
       System.out.print(name.substring(5,8));
       
       // one of the free responses will be string manipulation
       // string manipulation happens all the time
    
       // string is not a data type, its an array of functions like an object
        
       
       */
      
       /**/
       //!!!!! Makes a random object and numbers
       Random generator = new Random();
       
       // number between 0 to n-1
       x = generator.nextInt(100); // gives num from 0-99
       System.out.print("Random #1" + x);
       
       // other way to generate a random number
       // num between .000000000001 - 1 non-inclusive
       num = generator.nextDouble();
       System.out.print("Random #2 "+num);
       // Change the range to 100 numbers in the range of 100-200. Can do this with other generator methods, but math one is more common
       //   * multiply by how many numbers, + or - to push the range.
       num = Math.random() *100 + 100;
       System.out.print("Random #3 "+num);
    
       // in ap: indentation shows intention
       
       
       
    }
}
