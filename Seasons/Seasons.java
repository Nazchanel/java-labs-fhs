
/**
 * Practice for the Seasons app
 * @period (4A)
 * @author (Eshan Iyer) 
 * @version (10/7/21)
 */
import java.util.*;

public class Seasons
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        System.out.println("Enter left tire pressure >>>  ");
        int leftPressure = console.nextInt();
        console.nextLine();
        
        System.out.println("Enter right tire pressure >>>  ");
        int rightPressure = console.nextInt();
        console.nextLine();
        
        if (leftPressure < 36 || rightPressure < 36)
        {
            System.out.println("Warning! low tire pressure");
        }
        
        System.out.println("Enter left tire pressure >>>  ");
        leftPressure = console.nextInt();
        console.nextLine();
        
        System.out.println("Enter right tire pressure >>>  ");
        rightPressure = console.nextInt();
        console.nextLine();
        
        if (leftPressure + 4 >= rightPressure ||leftPressure - 4 >= rightPressure || rightPressure - 4 >= leftPressure || rightPressure + 4 >= leftPressure)
        {
            System.out.println("Warning! Uneven tire pressure");
        }
        
        System.out.println("Enter your grade >>> ");
        double grade = console.nextDouble();
        console.nextLine();
        
        if (grade >= 90)
        {
            System.out.println("A");
        }
        else if (grade >= 80 && grade < 90)
        {
            System.out.println("B");
        }
        else if (grade >= 70 && grade < 80)
        {
            System.out.println("C");
        }
        else if (grade >= 60 && grade < 70)
        {
            System.out.println("D");
        }
        else
        {
            System.out.println("F");
        }
        
        System.out.println("Enter an integer >>> ");
        int num = console.nextInt();
        console.nextLine();
        
        int num1 = num % 10;
        
        if (num1 >= 5) 
        {
            num += num1;
            System.out.println(num);
        }
        else if (num1 < 5) 
        {
            num -= num1;
            System.out.println(num);
        }
    }
}
       