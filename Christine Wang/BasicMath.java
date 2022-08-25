
//-------------------------------------------------------------------------------
// Author: Christine Wang
// Date: 8/12/2022
// BasicMath.java
// Prints the sum, difference, product, quotient, and power based on given inputs
// Variables: a, b
//-------------------------------------------------------------------------------

import java.util.Scanner;

public class BasicMath
{
    public static void main (String[] args)
    {
        double a, b;
        
         Scanner scan = new Scanner (System.in);
         
         System.out.println ("Enter 2 numbers to be calculated.");
         
         a = scan.nextDouble();
         b = scan.nextDouble();
         
         System.out.println ("First Output:");
         
         System.out.println ();
         
         System.out.println ("Sum: " + (a + b));
        
         System.out.println ("Difference: " + (a - b));
         
         System.out.println ("Product: " + (a * b));
         
         System.out.println ("Quotient: " + (a / b));
         
         System.out.println ("Remainder: " + (a % b));
         
         System.out.println ("Power: " + Math.pow(a, b));
         
         System.out.println ();
        
         // Switches variables a and b around
         
         System.out.println ("Second Output:");
         
         System.out.println ();
         
         System.out.println ("Difference: " + (b - a));
         
         System.out.println ("Quotient: " + (b / a));
         
         System.out.println ("Remainder: " + (b % a));
         
         System.out.println ("Power: " + Math.pow(b, a));
         
    }
}
