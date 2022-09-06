/**
 * Printing 20 powers of two, starting with thirty-two.
 * 
 * @author (Eshan Iyer) 
 * @version (12/8/21)
 * @period (4A)
 */



import java.util.*;

public class JavaProject8Delta1
{
   public static void main(String[] args)
   {  
        Scanner console = new Scanner(System.in);
        Random rng = new Random();
       
        
       
        int num = 2; // Number the base is
        
        // Needs to go to the 24th power because it starts at 5 and goes twenty times including that
        for (int j = 5; j < 25; j++)
           {
               for(int i = 1; i< j; i++)
               {
                   num *=2; // Taking the number to a power j amount of times
                }
               System.out.print(num + " ");
               num = 2; // Resetting the value to get the next power

            }
        
       
       
        final double PI = 3.14159265;
        final double MIN_WAGE = 7.25;
        final double KM = 1.609344;
   }
}
