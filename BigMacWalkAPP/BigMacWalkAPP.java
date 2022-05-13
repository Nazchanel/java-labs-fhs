/**
 *Outputs how many miles you need walk to burn off a fast food meal.  
 * 
 *@author: Eshan Iyer 
 *@period: 4A
 *@version: (9/1/21)
 **/

public class BigMacWalkAPP
{
    public static void main(String[] args)
    {
        //Part 1: Eating just Big Macs
        System.out.println("Part 1: Eating just Big Macs.");
        int numBigMacs = 4; // Declaring and initializing the number of Big Mac eaten
        double calsPerMile = 94; // How many calories burned of one mile of walking
        double calsTotal = 590* numBigMacs; // Multiplies the num of cals inside a Big Mac to the amount of Big Macs to find the total amount of cals consumed
        double milesTotal = calsTotal/calsPerMile; // Find the total miles that are needed to walk to burn off the consumed Big Macs
        System.out.println("Big Macs eaten >>> " + numBigMacs);
        System.out.println("Total calories consumed >>> " + calsTotal);        
        System.out.println("Miles to walk to burn off all those Big Macs >>> " + milesTotal);
        
        //Part 2: You adding some fries and a soft drink to your meal!
        
        System.out.println("\nPart 2: You adding some fries and a soft drink to your meal!");
        int numDrinks = 1; // Amount of drinks consumed
        int numFries = 1; // Number of fries consumed
        calsTotal+=(150*numDrinks)+(365*numFries); // Makes the new total of total calories the addition of itself and the new calorie amounts
        System.out.println("Big Macs eaten >>> " + numBigMacs);
        System.out.println("Fries eaten >>> " + numFries);
        System.out.println("Soft Drinks drunken >>> " + numDrinks);
        System.out.println("Total calories consumed >>> " + calsTotal );
        System.out.println("Miles to walk to burn off all that chow >>> " + milesTotal );
        
    }
}