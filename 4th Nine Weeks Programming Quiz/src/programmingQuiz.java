// Name: Eshan Iyer
// Period: 4B
// Date: 4/8/22
// Description:
// Part A: Finds if the string has an equal amount of two Strings
// Part B: Finds if the String is mirrored

import java.util.*;
public class programmingQuiz {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        //User Input

        System.out.print("Part A: Enter a String value >>> ");
        String str = console.nextLine();

        System.out.println(equalsNot(str));

        System.out.println();

        System.out.print("Part B: Enter a String value >>> ");
        str = console.nextLine();

        System.out.println(mirrorEnds(str));
    }

        public static String mirrorEnds(String str)
    {
        // Empty String to concatanate to
        String returnString = "";

        int lastIndex = str.length()-1;

        // If statement to work the case when there is no chance of there being a mirror
        if (str.charAt(0) != str.charAt(str.length()-1))
        {
            return "none";
        }
        for (int i = 0; i < str.length(); i++)
        {

            // Gets first and last characters
            char firstChar = str.charAt(i);
            char lastChar = str.charAt(lastIndex);

            if (firstChar == lastChar)
            {
                returnString += firstChar;
            }
            else
            {
                return returnString;
            }
            lastIndex--; // Subtracts down one to get the new scope of the String we are looking at

        }

        // If the loop does not work (It will)
        return "placeholder";

    }


    public static boolean equalsNot(String str) {
        String is = "is";
        String not = "not";

        // Splits the string into an Array so the spaces can be removed
        String[] removeSpaces = str.split(" ");
        String fixedString = "";

        for (int i = 0; i < removeSpaces.length; i++)
        {
            fixedString += removeSpaces[i];
        }

        // Initializes the String with the removed spaces to the original name of 'str'
        str = fixedString;


        int isLength = is.length();
        int notLength = not.length();

        int isCount = 0;
        int notCount = 0;

        // The '+ 1" on the String length prevents the loop for outptting an Out of Bounds Error.
        for (int i = 0; i < str.length()-isLength+1; i++) {
            String currentLetters = str.substring(i, i + isLength);
            if (currentLetters.equals(is)) {
                isCount++; // Increases the count when the String is found
            }

        }
        for (int i = 0; i < str.length()-notLength+1; i++) {

            String currentLetters = str.substring(i, i + notLength);
            if (currentLetters.equals(not)) {
                notCount++;
            }

        }

        // Returns the boolean value if the counts are the same
        return notCount == isCount;
    }

}