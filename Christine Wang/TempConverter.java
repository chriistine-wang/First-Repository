
//-------------------------------------------------------------------------------------
// Author: Christine Wang
// Date: 8/12/2022
// TempConverter.java
// Reads temperature from the user, prints out the conversion of Fahrenheit to Celsius
// Variables: BASE, CONVERSION_FACTOR, fahrenheitTemp, celsiusTemp
//-------------------------------------------------------------------------------------

import java.util.Scanner;

public class TempConverter
{
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~  
    // Computes the Celsius equivalent of a specific Fahrenheit value using
    // the formula C = (5/9)F - 32.
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void main (String [] args)
    {
        final double BASE = 32;
        final double CONVERSION_FACTOR = 5.0/9.0;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Input the Fahrenheit value you'd like converted to Celsius.");
        double fahrenheitTemp = scan.nextDouble();
        double celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;
        
        System.out.println ("Celsius Equivalent: " + celsiusTemp);

    }
}
