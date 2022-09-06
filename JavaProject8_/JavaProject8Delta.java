
/**
 * Print multiples of 3 with every four being a question mark
 * 
 * @author (Eshan Iyer) 
 * @version (12/8/21)
 * @period (4A)
 */



import java.util.*;

public class JavaProject8Delta
{
   public static void main(String[] args)
   {  
       Scanner console = new Scanner(System.in);
       Random rng = new Random();
       
       // Counter variable to keep track of how many times it prints to print a question mark 
       int counter = 1;
       
       // Iterates over the number and adds three to get multiples
       for(int i = 15; i <=48; i+=3)
       {
           if (counter == 4)
           {
               System.out.print("? ");
               counter = 0; // Resets the counter
               counter++;
           }
           else
           {
               System.out.print(i + " ");
               counter++;
            }
       }
       
       
       final double PI = 3.14159265;
       final double MIN_WAGE = 7.25;
       final double KM = 1.609344;
   }
}