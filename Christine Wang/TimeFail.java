
//-------------------------------------------------------------------------------------
// Author: Christine Wang
// Date: 8/13/2022
// TimeFail.java
// Reads a value representing a number of seconds, prints that value in
// hours, minutes, and seconds
// Variables: 
//-------------------------------------------------------------------------------------

import java.util.Scanner;
import java.text.DecimalFormat;

public class TimeFail
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);    
        
        DecimalFormat fmt = new DecimalFormat ("0.##");

        double secs;
        double hrs;
        double mins;
        
        int full_secs;
        int full_hrs;
        int full_mins;
        
        // Reads amount of seconds from user
        
        System.out.println ("Convert seconds to the time expressed in hours, "
        + "minutes, and seconds.");
        
        System.out.println ();
        
        System.out.print ("Seconds: ");
        
        full_secs = scan.nextInt();
        
        // Computes the number of whole hours from seconds
        
        full_hrs = (full_secs / 3600);
        
        System.out.print (full_hrs + " hours, "); // Testing
        
        // Assigns seconds to double data type
        
        secs = full_secs;
        
        hrs = (secs / 3600);
        
        // Computes the leftover hours
        
        hrs = (hrs - full_hrs);
        
        // Computes minutes
        
        mins = (hrs * 60);
                
        // Computes the number of whole minutes from minutes
        
        full_mins = (int) mins; 
        
        System.out.print (full_mins + " minutes,"); // Testing
        
        double remaining_mins;
        
        remaining_mins = (double) (mins - full_mins);
        
        // Computing remaining seconds
        
        double remaining_secs;
        
        remaining_secs = (remaining_mins * 60);
        
        System.out.print(" and " + fmt.format(remaining_secs) + " seconds.");
        
    }
}
