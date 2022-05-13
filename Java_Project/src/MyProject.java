/**
 * Name: Eshan Iyer
 * Period: 4A
 * Description: Intersects two words at a common letter
 */

import java.util.*;
public class MyProject
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        // Gets the two words
        System.out.print("Across word? ");
        String acrossWord = console.nextLine();

        System.out.print("Down word? ");
        String downWord = console.nextLine();

        // Sets up variables
        String spacing = "                ";
        char acrossChar;
        char downChar;
        int index = 0;
        int spaceIndex = 0;

        for (int i = 0;i < downWord.length();i++)
        {
            acrossChar = acrossWord.charAt(i); // Gets character at the first index

            for(int j = 1;j < acrossWord.length();j++)
            {
                downChar = downWord.charAt(j); // Gets each char of the down word to compare with across char
                if (downChar==acrossChar) {
                    spaceIndex = acrossWord.indexOf(downChar); // Gets the amount of space that is needed
                    index = downWord.indexOf(acrossChar); // Gets index of intersection
                }

            }
        }
        spacing = spacing.substring(0,spaceIndex); // Finalizes the spacing using the spacingIndex
        for(int i = 0;i < acrossWord.length();i++) {

            // Prints the word when the index is found
            if (i == index) {
                System.out.println(acrossWord);
            }
            else {
                System.out.print(spacing);
                System.out.println(downWord.charAt(i));
            }
        }





    }
}
