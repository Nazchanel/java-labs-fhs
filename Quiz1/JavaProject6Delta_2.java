
/**
 * print multiples of 3 with every 4th multiple being a ?
 * 
 * @author (Eshan Iyer) 
 * @version (11/15/21)
 */


import java.util.*;

public class JavaProject6Delta_2
{
   public static void main(String[] args)
   {  
       Scanner console = new Scanner(System.in);
       int num = 3;
       int count = 1;
       
       while(num <=36)
       {
           
           if (count == 4)
           {
               System.out.print("? ");
               count = 1;
               num+=3;
               
            }
           else
           {
               System.out.print(num + " ");
               num+=3;
               count++;
            }
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