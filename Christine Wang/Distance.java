
//-------------------------------------------------------------------------------------
// Author: Christine Wang
// Date: 8/13/2022
// Distance.java
// Reads the (x, y) coordinates for two points. Compute using the distance formula.
// Variables: x1, y1, x2, y2
//-------------------------------------------------------------------------------------

import java.util.Scanner;

public class Distance
{
     public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in); 
        
        System.out.println ("Input the four coordinates in the following order:"
        + " x1, y1, x2, y2 to get the distance between two points.");
        
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        
        System.out.println ("The distance between the points is: " + Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2))));
        
        
    }
}
