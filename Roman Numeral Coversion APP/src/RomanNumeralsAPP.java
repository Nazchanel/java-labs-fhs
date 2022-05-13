//Name:
//Period:
import java.util.*;

public class RomanNumeralsAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String[] str = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};

        final int[] NUMBERS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        System.out.print("Enter an integer less than 4000 >>> ");
        int num = console.nextInt();

        String romanNumeral = "";
        String initalNumeral = "";

        int index = 0;
        int difference = 0;

        for (int i = 0; i< NUMBERS.length; i++)
        {
            if (NUMBERS[i] <= num)
            {
              initalNumeral = LETTERS[i];
              romanNumeral+=initalNumeral;
              difference = num-NUMBERS[i];
              break;
            }
        }
        for (int j =0; j<=10000; j++)
        {
            for (int i = 0; i < NUMBERS.length; i++) {
                if (NUMBERS[i] <= difference)
                {
                    initalNumeral = LETTERS[i];
                    romanNumeral+=initalNumeral;
                    difference -=NUMBERS[i];

                    break;
                }
            }
            if (difference == 0)
            {
                break;
            }
        }


        System.out.println(num +" is "+romanNumeral);





    }


}