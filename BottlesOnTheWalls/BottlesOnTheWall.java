
/**
 * Practice while loops
 * 
 * @author (Eshan Iyer) 
 * @version (10/20/21)
 * @period (4A)
 */

import java.util.*;

public class BottlesOnTheWall
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        // Challenge 2
        
        int i = 1; // Starting Value
        while (i <= 9)
        {
            System.out.print(i);
            i++;
            
        }
        System.out.println();
        

        // Challenge 3
        
        i = 1; // Starting Value
        while (i <= 9)
        {
            System.out.print(i+ " ");
            i++;
        }
        
        System.out.println();
        
        // Challenge 4
        
        i = 1; // Starting Value
        
        while (i <= 20)
        {
            if (i % 2 != 0)
            {
                System.out.print(i+ " "); 
            }
            i++;
        
        }
        
        System.out.println();
        
        // Challenge 5
        
        i = 1; // Starting Value
        
        while (i <= 50)
        {
            if (i % 5 == 0)
            {
                System.out.print(i+ " "); 
            }
            i++;
        
        }
        
        System.out.println();
        
        // Challenge 6
        
        i = 10; // Starting Value
        
        while (i >= 1)
        {
            System.out.print(i+ " "); 
            i--;
        
        }
        
        System.out.println();
        
        // Challenge 8
        
        i = -4; // Starting Value
        
        while (i >= -40)
        {
            if (i % 4 == 0)
            {
                System.out.print(i+ " "); 
            }
            i--;
        
        }
        
        System.out.println();
        
        // Challenge 9
        
        i = 1; // Starting Value
        
        while (i <= 256)
        {
            System.out.print(i+ " "); 
            
            i+= i;
        
        }
        
        
        System.out.println();
        
        // Challenge 10
        
        i = 1000; // Starting Value
        
        while (i >= 3)
        {
            System.out.print(i+ " "); 
            
            i/= 2;
        
        }
        
        System.out.println();
        
        // Challenge 11
        
        int p = 1; // positive starting value
        int n = -1; // negative starting value
        
        // sorry I couldnt do it in one variable. This was just easier
        
        while (p <= 8 && n >= -8)
        {
            
            System.out.print(p + " "); 
            System.out.print(n+ " "); 
            p += 1;
            n -= 1;
         
        }
    }
}