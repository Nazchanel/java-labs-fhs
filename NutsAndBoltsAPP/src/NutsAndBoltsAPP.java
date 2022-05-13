/**
 * Program that calculates and prints out the total price
 *
 * @author (Eshan Iyer)
 * @version (10/30/21)
 * @period (4A)
 */

import java.util.*;


public class NutsAndBoltsAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);



        System.out.print("Number of bolts >>> ");
        int bolts = console.nextInt();
        console.nextLine();

        System.out.print("Number of nuts >>> ");
        int nuts = console.nextInt();
        console.nextLine();

        System.out.print("Number of washers >>> ");
        int washers = console.nextInt();
        console.nextLine();

        int boltsPrice = 5*bolts;
        int nutsPrice = 3*nuts;
        int washerPrice = washers;
        int totalPrice = washerPrice + nutsPrice + boltsPrice;
        System.out.println();

        boolean first = nuts >= bolts;
        boolean second = washers/2 >= bolts;

        boolean checker = true;
        if (!first)
        {
            System.out.println("Warning! Check order: too few nuts\n");
            checker = false;
        }
        if (!second)
        {
            System.out.println("Warning! Check order: too few washers\n");
            checker = false;
        }
        if (checker)
        {
            System.out.println("Order OK!");
        }
        System.out.print("\nTotal cost (in cents) >>> " + totalPrice);

    }
}