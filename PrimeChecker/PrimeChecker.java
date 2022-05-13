
/**
 * Write a description of class PrimeChecker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//Name:
//Period:
import java.util.*;

public class PrimeChecker
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //1 
        
        for(int i= 1; i<=9; i++)
        {
            System.out.print(i);
            
        }
        System.out.println();
        
        //2 
        
        for(int i= 1; i<=9; i++)
        {
            System.out.print(i+ " ");
            
        }
        System.out.println();
        
        //3
        
        for(int i= 1; i<=20; i++)
        {
            if (i%2 == 0)
            {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        
        //4
        
        for(int i= 20; i<=25; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        
        //5 

        for(int i= 1; i<=80; i++)
        {
            if (i%10 == 0)
            {
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        
        //7 
        
        for(int i= 0; i>=-10; i--)
        {
           
            System.out.print(i+ " ");
            }
        System.out.println();
        
        //8
        
        System.out.print("Enter an integer >>> ");
        int num = console.nextInt();
        console.nextLine();
        
        for(int i= 0; i<num; i++)
        {
           
            System.out.print("* ");
            }
        System.out.println();
        
        //9
        
        for(int i= 1; i<=10; i++)
        {
           
            System.out.print(i*i + " ");
            }
        System.out.println();
        
        //10

        for(int i= 1; i<=9; i++)
        {
            if (i % 3 == 0)
            {
              System.out.print("? ");  
            }
            else
            {
                System.out.print(i + " ");
            }
            }
        System.out.println();
        
        //11
        
        System.out.print("Enter an integer >>> ");
        int n = console.nextInt();
        console.nextLine();
        int factorial = 1;
        for(int i= 1; i<=n; i++)
        {
           factorial = i*factorial;
            }
        System.out.println(factorial);
    }
}
