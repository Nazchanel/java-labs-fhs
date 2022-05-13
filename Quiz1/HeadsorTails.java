
/**
 * Flips a coin and prints if its heads is flipped 3 times
 * 
 * @author (Eshan Iyer) 
 * @version (11/15/21)
 */
import java.util.*;

public class HeadsorTails
{
   public static void main(String[] args)
   {  
       Scanner console = new Scanner(System.in);

       Random coinFlip = new Random();
       // The variable "headsTails" will return true or 
       // false randomly.
       // Place it in the proper spot in the project;
       // leave the "Random" statement after the Scanner.
       boolean headsTails = coinFlip.nextBoolean();
       int count = 0;
       while(count != 3)
       {
            headsTails = coinFlip.nextBoolean();
            if (headsTails)
            {
                System.out.print("H ");
                count++;

            }
            else
            {
                System.out.print("T ");
                count = 0;
            }
            
        }
       System.out.println("\n\nThree heads in a row!");
       
       
       
      
       Random direction = new Random();
       // Use the variable "howFar" to generate 
       // the distance traveled between pings.
       int howFar = direction.nextInt(5) - 2;

   }
}