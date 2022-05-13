/**
 * Printing a given string a user inputted amount of times.
 * 
 * @author (Eshan Iyer) 
 * @version (12/8/21)
 * @period (4A)
 */

import java.util.*;

public class JavaProject8Delta2
{
   public static void main(String[] args)
   {  
        Scanner console = new Scanner(System.in);
        Random rng = new Random();
       
        // User prompt
        System.out.print("How many times do you want the string to be printed out?  ");
        int num = console.nextInt();
        console.nextLine();
        
        // String that will be printed
        String pew = "pew";
        
        
        // Making j the inputted variable so we can iterate over it       
        for (int j = num; j > 0; j--)
        {
           System.out.print(pew + "! ");
        }
        
       
       
        final double PI = 3.14159265;
        final double MIN_WAGE = 7.25;
        final double KM = 1.609344;
   }
}
