
//-------------------------------------------------------------------------------------
// Author: Christine Wang
// Date: 8/13/2022
// Time.java
// Reads a value representing a number of seconds, prints that value in
// hours, minutes, and seconds
// Variables: secs, hrs, mins
//-------------------------------------------------------------------------------------

import java.util.Scanner;

public class Time
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in); 
        
        int secs;
        int hrs;
        int mins;
        
        // Reads amount of seconds from user
        
        System.out.println ("Convert seconds to the time expressed in hours, "
        + "minutes, and seconds.");
        
        System.out.println ();
        
        System.out.print ("Seconds: ");
        
        secs = scan.nextInt();
        
        // Computes the number of whole hours from seconds
        
        hrs = (secs / 3600);
        
        System.out.print (hrs + " hours, ");
        
        // Computes minutes
        
        mins = (secs % 3600)/60;
        
        System.out.print (mins + " minutes,"); 
        
        // Computes seconds
        
        secs = (secs % 60);
        
        System.out.print(" and " + (secs) + " seconds.");
        
    }
}
