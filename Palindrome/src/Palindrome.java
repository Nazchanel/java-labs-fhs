//Name: Eshan Iyer
//Period: 4B

import java.util.*;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        //1
        System.out.print("1: Enter a String value >>> ");
        String str = console.nextLine();

        System.out.println("1: The length of \"str\" is: " + str.length());

        System.out.println();

        //2
        System.out.print("2: Enter a String value >>> ");
        str = console.nextLine();

        System.out.println(str.substring(1));

        System.out.println();

        //3
        System.out.print("3: Enter a String value >>> ");
        str = console.nextLine();

        System.out.println(str.substring(0,str.length()-1));

        System.out.println();

        //4
        System.out.print("4: Enter a String value >>> ");
        String wordOne = console.nextLine();

        System.out.print("4: Enter a String value >>> ");
        String wordTwo = console.nextLine();

        if (wordOne.length()<wordTwo.length())
        {
            System.out.println(wordOne + wordTwo + wordOne);
        }
        else
        {
            System.out.println(wordTwo + wordOne + wordTwo);
        }

        System.out.println();

        //5
        System.out.print("5: Enter a String with even length >>> ");
        String evenString = console.nextLine();

        System.out.println(evenString.substring(0,evenString.length()/2));

        System.out.println();

        //6
        System.out.print("6: Enter a String value >>> ");
        String alpha = console.nextLine();

        System.out.print("6: Enter a String value >>> ");
        String beta = console.nextLine();

        alpha = alpha.substring(1);
        beta = beta.substring(1);

        System.out.println(alpha+beta);

        System.out.println();

        //8
        System.out.print("8: Enter a String value >>> ");
        alpha = console.nextLine();

        String temp = "";

        for (int i = 0; i<alpha.length(); i++)
        {
            temp = alpha.substring(0,i);
            if (temp.equals("bad"))
            {
                System.out.println("HAS BAD");
            }
        }

        System.out.println();

        //9
        System.out.print("9: Enter a String value >>> ");
        beta = console.nextLine();

        if (!beta.equals("way"))
        {
            System.out.println("No way");
        }

        System.out.println();

        //10
        System.out.print("10: Enter a String value >>> ");
        beta = console.nextLine();

        System.out.println(beta.substring(1,beta.length()-1));

        System.out.println();

        //11
        System.out.print("11: Enter a String value >>> ");
        String oddString = console.nextLine();

        int midPoint = oddString.length()/2;

        System.out.println(oddString.substring(midPoint-1,midPoint+2));


        System.out.println();













    }
}