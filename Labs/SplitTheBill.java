/**
 * John Aabram and Christine Wang
 * 8/30/22
 * Split the bill
 * Lets the user enter the cost of the meal, and how many people are splitting the bill. Then calculates the total and prints the bill, the tip, the total cost and the amount each person has to pay
 * Who helped me: dog
 *

 */
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
import java.text.NumberFormat;



public class SplitTheBill
{
    public static void main(String[] args)
    {    
        Scanner keyboard = new Scanner(System.in);    
        
        double bill, friends, total, tip, pay;
        
        System.out.println("How many friends are you eating with, including you?");
        friends = keyboard.nextDouble();
        
        System.out.println("How much was the bill? ");
        bill = keyboard.nextDouble();  
        
        tip = bill *.2;
        
        total = bill + tip;
        
        pay = total/friends;
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        System.out.println("Bill: " +money.format(bill));
        System.out.println("Tip: " +money.format(tip));
        System.out.println("Total: " +money.format(total));
        System.out.println("Each person has to pay " +money.format(bill/friends)+ " for the bill, and " +money.format(tip/friends)+ " for the tip");
    }
}
