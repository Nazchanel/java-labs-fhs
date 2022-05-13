
/**
 * Print first 19 multiples of 11. 
 * 
 * @author (Eshan Iyer) 
 * @version (11/15/21)
 */


import java.util.*;

public class JavaProject6Delta_3
{
   public static void main(String[] args)
   {  
       int count = 1;
       int num = 1; 
       
       while(count <=19)
       {
           if (num%11 == 0)
           {
               System.out.print(num + " ");
               count++;
            }
            
            num++;
        }
       
       
       
       
       
       
       Scanner console = new Scanner(System.in);

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