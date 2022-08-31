
/**
 * Christine Wang
 * 8/31/22
 * Sphere
 * Program that reads radius of sphere, prints its volume and surface area and circumference. 
 * Who helped me: Addison
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Sphere
{
   public static void main(String[] args)
    {    
        Scanner keyboard = new Scanner(System.in);
        
        double radius, volume, surface_area, circumference;
        double fraction = 1.333333;
        
        System.out.print ("Radius of Sphere: ");
        radius = keyboard.nextDouble();
        
        System.out.println ("Sphere Volume: " + fraction * Math.PI * (Math.pow(radius,3)));
        System.out.println ("Sphere Surface Area: " + 4 * Math.PI * (Math.pow(radius,2)));

        
        
        
   
    }
}
