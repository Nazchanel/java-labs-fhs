
/**
 * Write a description of class LuckyDice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class LuckyDice
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //1
        
        System.out.print("Enter a number >>> ");
        int num = console.nextInt();
        console.nextLine();
        System.out.print("Factors of "+ num +" >>> ");
        
        for (int i = 1; i<=num; i++)
        {
            if (num % i == 0)
            {
                System.out.print(i + " ");
            }
            
        }
        System.out.println("\n");
        
        //2
        
        System.out.print("Enter a number >>> ");
        int n = console.nextInt();
        int count = 0; 
        console.nextLine();
        
        for (int i = 1; i<=n; i++)
        {
            if (i % 3 == 1 && i % 4 == 1 && i % 5 == 1 && i % 6 == 1)
            {
                count++;
            }
            
        }
        
        System.out.println("There are " + count + " cool numbers up to 5000");
        System.out.println();
        
        //3
        
        System.out.print("Enter a number >>> ");
        n = console.nextInt();
        count = 0; 
        console.nextLine();
        int j = 1;
        
        while (j<=n)
        {
            if (j % 3 == 1 && j % 4 == 1 && j % 5 == 1 && j % 6 == 1)
            {
                count++;
            }
            j++;
        }

        System.out.println("There are " + count + " cool numbers up to 5000");
        System.out.println();
        
        //5
        
        System.out.print("Enter a number >>> ");
        n = console.nextInt();
        console.nextLine();
        
        int factor = 0;
        
        for (int i = 1; i<n; i++)
        {
            if (n % i == 0)
            {
                factor += i;
                
            }
            
        }
        
        if (factor == n)
        {
            System.out.println("The number is perfect!\n");
        }
        else
        {
            System.out.println("The number is not perfect!\n");
        }
        
        //6
        
        System.out.print("Enter a number >>> ");
        n = console.nextInt();
        console.nextLine();
        
        factor = 0;
        int m = 1;
        
        do 
        {
            if (n % m == 0)
            {
                factor += m;
            }
            m++;
        }
        while (m < n);
        
        if (factor == m)
        {
            System.out.println("The number is perfect!\n");
        }
        else
        {
            System.out.println("The number is not perfect!\n");
        }
    }
}

