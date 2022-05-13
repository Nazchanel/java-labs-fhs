/**
 * Preparation to create a guessing game
 *
 * @author (Eshan Iyer)
 * @version (10/26/21)
 * @period (4A)
 */



import java.util.*;

public class GuessingGame
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        //1: Pseudocode

        // Ask for input from the console
        // Store value in an int variable
        // Set a new variable to 1
        // Start a while loop where it will stop when the counter variable is greater than the input
        // Print the counter variable while looping

        //------------------------------------------------------------------------------------------
        System.out.print("Enter an integer >>> ");
        int num = console.nextInt();
        console.nextLine();

        int counter = 1;

        while (counter <= num)
        {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println("\n");

        //2

        System.out.print("Enter an integer >>> ");
        num = console.nextInt();
        console.nextLine();
        int sum = 0;
        counter = 0;

        while(counter <= num)
        {
            sum+=counter;
            counter++;
        }
        System.out.println("Sum of all numbers from 1 to " + num + " >>> " + sum);
        System.out.println();

        //3

        System.out.print("Enter an integer >>> ");
        num = console.nextInt();
        console.nextLine();
        sum = 0;
        counter = 0;

        while(counter <= num)
        {
            if (counter % 2 == 0)
            {
                sum+=counter;
            }

            counter++;
        }
        System.out.println("Sum of all even numbers from 1 to " + num + " >>> " + sum);
        System.out.println();

        // 4

        System.out.print("Enter an integer >>> ");
        num = console.nextInt();
        console.nextLine();
        sum = 0;
        counter = 0;

        while(counter <= num)
        {
            if (counter % 7 == 0)
            {
                sum+=counter;
            }

            counter++;
        }
        System.out.println("Sum of all multiples of 7 to " + num + " >>> " + sum);
        System.out.println();

        System.out.print("Enter an integer >>> ");
        num = console.nextInt();
        console.nextLine();

        int length = 0;
        int temp = 1;
        if (num < 0)
        {
            num/=-1;
        }
        while (temp <= num) {
            length++;
            temp *= 10;
        }
        System.out.println("Number of digits in num >>> " + length);

    }
}

