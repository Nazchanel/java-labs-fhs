
/**
 * Checks if number is prime.
 * 
 * @author (Eshan Iyer) 
 * @version (11/17/21)
 */
import java.util.*;

public class PrimeCheckerAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        boolean run = true; 
        
        while (run)
        {
            System.out.print("Enter 1 to check if a number is prime or 2 to exit >>> ");
            int check = console.nextInt();
            console.nextLine();
            if (check == 2)
            {
                run = false;
                continue;
            }
            System.out.print("Please enter an integer to check >>> ");
            long num = console.nextLong();
            console.nextLine();
            
            boolean ifPrime = true; 
            
            for (int i = 2; i<= 10; i++)
            {
                if (num % i == 0)
                {
                    ifPrime = false;
                }
                
            }
            
            if (ifPrime)
            {
                System.out.println(num + " is a prime number.\n");
            }
            else
            {
                System.out.println(num + " is a composite number.\n");
            }
        }
        
        
        
        
    }
}