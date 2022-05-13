
/**
 * Write a description of class LuckyDiceAPP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


import java.util.*;

public class LuckyDiceAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Number of faces on each die? >>> ");
        int numFaces = console.nextInt();
        console.nextLine();
        
        System.out.print("Number of simulations? >>> ");
        int numSims = console.nextInt();
        console.nextLine();
        
        int roll;
        int roll_2;
        
        int counter = 0;
        int simNum = 0;
        
        int iter = 0; // Get divisor for the average
        int sum = 0; // Get sum of all the rolls via counter
        
        int numRolls = 0;
        int numPoints = 0;
        
        System.out.println();
        
        for (int i =1; i <= numSims; i++)
        {
            numPoints = 0;
            counter = 0; 
            
            while(numPoints < 1000) 
            {
                roll = random.nextInt(numFaces)+ 1;
                roll_2 = random.nextInt(numFaces)+ 1;
                counter++;
                numPoints += roll + roll_2;
                
            }
            iter++;
            sum+=counter;
            simNum++;
            
            System.out.println("Simulation " + simNum + " - number of rolls to reach 1000 >>> " + counter + "\n");  
                        
           
        }
        
        System.out.print("\nAverage number of rolls, for all simulations >>> "  + (sum/iter));
    }
}

