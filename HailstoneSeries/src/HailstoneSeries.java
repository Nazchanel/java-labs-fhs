/**
 * Practice sentinel loops
 *
 * @author (Eshan Iyer)
 * @version (10/30/21)
 * @period (4A)
 */

import java.util.*;

public class HailstoneSeries
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int i = 2;
        int j = 0;
        while(i != 0)
        {
            System.out.println("Enter an integer (or 0 to quit) >>> ");
            i = console.nextInt();
            j = j+i;
            console.nextLine();

        }
        System.out.println("Sum of integers >>> "+j+"\n");

        double potency = 100;
        int month = 0;
        while(potency >= 50)
        {
            System.out.println("Month " + month + " Potency:  " + potency);
            month++;
            potency = potency-(potency * .12);

        }
        System.out.println("Month " + month + " Potency:  " + potency+ "  <<< DISCARD");

        int pin = 1234;
        int userPin;
        boolean access = false;
        int accessCount = 3;
        while (!access)
        {
            System.out.println("Enter you PIN >>> ");
            userPin = console.nextInt();
            console.nextLine();
            if (userPin == pin)
            {
                System.out.println("Access granted");
                access = true;
            }
            else
            {
                System.out.println("Invalid PIN, try again");
                accessCount--;
            }
            if (accessCount == 0)
            {
                System.out.println("Account has been locked");
                access = true;
            }
        }

        }
    }

