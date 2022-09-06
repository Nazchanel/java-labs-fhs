/**
 * Printing a chart of mile to kilometer conversions using for loops.
 * 
 * @author (Eshan Iyer) 
 * @version (12/8/21)
 * @period (4A)
 */

import java.util.*;

public class RoadTripToMexico
{
   public static void main(String[] args)
   {  
        Scanner console = new Scanner(System.in);
        Random rng = new Random();
        
        // Not needed
        final double PI = 3.14159265;
        final double MIN_WAGE = 7.25;
        
        // How many kilometers there are in a mile
        final double KM = 1.609344; 
        
        // Multiples of 5, going up to 300 miles
        for (int i = 5; i <= 300; i+=5)
        {
            double converted = i * KM; // Converts the miles to km and stores it 
            System.out.println("Miles = " + i +" >>> kilometers = " + converted );
        }
        
        
   }
}
