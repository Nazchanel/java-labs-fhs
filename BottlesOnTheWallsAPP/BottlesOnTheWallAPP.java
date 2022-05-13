
/**
 * Making a computer sing the bottles on the wall song
 * 
 * @author (Eshan Iyer) 
 * @version (10/26/21)
 * @period (4A)
 */
import java.util.*;

public class BottlesOnTheWallAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your age? >>> ");
        int drink = 2;
        int age = console.nextInt();
        console.nextLine();
        if (age > 20)
        {
            System.out.print("Do you prefer beer or Coke? (enter 1 for beer, 2 for Coke) >>> ");
            drink = console.nextInt();
            console.nextLine();
        }
        String drink_ = "";
        if (drink == 2)
        {
            drink_ = "Coke";
        }
        else
        {
            drink_ = "beer";
        }
        int count = 99;
        while(count > 0)
        {
            System.out.println(count + " bottles of " + drink_ + " on the wall");
            System.out.println(count + " bottles of " + drink_);
            if (count > 1)
            {
                System.out.println("Take one down, pass it around, " + count + " bottles of " + drink_ + " on the wall!\n");
            }
            else
            {
                System.out.println("\nTake one down, pass it around, zero bottles of " + drink_ + " on the wall!\n");
            }
            if (count == 0)
            {
                break;
            }
            count--;
        }
        
        
   }
 }
