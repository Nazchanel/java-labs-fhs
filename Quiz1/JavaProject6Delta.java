
/**
 * Printing numbers from 0 to -12 
 * 
 * @author (Eshan Iyer) 
 * @version (11/12/21)
 */


import java.util.*;

public class JavaProject6Delta
{
   public static void main(String[] args)
   {  
       Scanner console = new Scanner(System.in);
       
       
       
       int num = 0;
       
       while (num >= -12)
       {
           System.out.print(num + " ");
           num--;
       }
       
       
       
       
       
       
       

       Random coinFlip = new Random();
       // The variable "headsTails" will return true or 
       // false randomly.
       // Place it in the proper spot in the project;
       // leave the "Random" statement after the Scanner.
       boolean headsTails = coinFlip.nextBoolean();
      
       Random direction = new Random();
       // Use the variable "howFar" to generate 
       // the distance traveled between pings.
       int howFar = direction.nextInt(5) - 2;

   }
}
 