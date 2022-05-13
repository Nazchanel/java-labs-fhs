
/**
 * Practicing if statements with input
 * 
 * @author (Eshan) 
 * @version (9/23/21)
 * @period (4A)
 */
import java.util.*;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        // 1: Write an if statement that will print "#1" if a is equal to 9. 
        
        System.out.print("Enter an integer value >>> ");
        int a = console.nextInt();
        
        if (a  == 9)
        {
            System.out.println("\n#1\n");
        }   
        
        // 2: Write an if statement that will print "#2" if b is equal to 9 or greater than 20. 
        
        System.out.print("Enter an integer value >>> ");
        int b = console.nextInt();
        
        if (b == 9 || b > 20)
        {
            System.out.println("\n#2\n");
        } 
        
        // 3: Write an if statement that will print "#3" if c equal to 5 or 6.
        
        System.out.print("Enter an integer value >>> ");
        int c = console.nextInt();
        
        if (c == 5 || c == 6)
        {
            System.out.println("\n#3\n");
        } 
       
        // 5: Write an if statement that will print "#5" if d is NOT equal to 4.
        
        System.out.print("Enter an integer value >>> ");
        int d = console.nextInt();
        
        if (d != 4)
        {
            System.out.println("\n#5\n");
        }
        
        // 6: Write an if statement that will print "#6" if e is less than 10, greater than 2, and not equal to 7.5.
        
        System.out.print("Enter a double value >>> ");
        double e = console.nextDouble();
        
        if (e < 10 && e > 2 && e != 7.5)
        {
            System.out.println("\n#6\n");
        }
        
        // 7: Write an if statement that will print "#7" if f is within four of g 
        
        System.out.print("Enter a double value >>> ");
        double f = console.nextDouble();
        int g = 20;
        
        if ((f - 4) <= 20 || (f + 4) >= 20)
        {
            System.out.println("\n#7\n");
        }
        
        // 8: Hanna’s Quest
        
        System.out.println("Welcome to Mr. Hanna’s Quest:\nAssign stats to your character (max 15 points TOTAL)\n****************************************************");
        System.out.println("Enter strength (from 1 to 10) >>> ");
        int strength = console.nextInt();
        System.out.println("Enter health (from 1 to 10) >>> ");
        int health = console.nextInt(); 
        System.out.println("Enter magic (from 1 to 10) >>> ");
        int magic = console.nextInt();
        int totalPoints = strength + health + magic;
        
        if (totalPoints > 15)
        {
            System.out.print("\nPoint limit exceeded!  Default values assigned\nStrength = 5, health = 5, magic = 5.  Good luck!");
            health = 5; 
            strength = 5;
            magic = 5;
        }

        
    }
}