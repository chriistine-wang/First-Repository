
//----------------------------------------------------------------------
// Author: Christine Wang
// Date: 8/12/2022
// Average.java
// Calculates the average based on the given input.
// Variables: a, b, c
//----------------------------------------------------------------------

import java.util.Scanner;

public class Average
{
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // Reads 3 numbers into 3 different variables and prints their average.
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void main (String[] args)
    {
        double a, b, c;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Enter the numbers you would like to take the "
        + "average of.");
        
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        System.out.println ("The average is " + ((a + b + c) / 3) + ".");
        
    }
    
    
    
}
