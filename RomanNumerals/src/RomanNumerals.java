//Name:
//Period:
import java.util.*;

public class RomanNumerals
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String[] str = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
        Random random = new Random();
        //2
        System.out.println(str.length);
        System.out.println();

        //3

        for(int i = 0; i< str.length; i++)
        {
            System.out.print(str[i].charAt(0) + " ");
        }

        System.out.println("\n");

        //4
        int endsWithe = 0;
        for(int i = 0; i< str.length; i++)
        {
            int lastCharIndex = str[i].length()-1;
            char lastChar = str[i].charAt(lastCharIndex);
            if (lastChar == 'e')
            {
                endsWithe++;
            }
        }

        System.out.println(endsWithe);

        System.out.println();

        //5
        int totalChars = 0;
        for(int i = 0; i< str.length; i++)
        {
            int lengthOfString = str[i].length();
            totalChars+= lengthOfString;
        }

        System.out.println("The total amount of characters in the array is: " + totalChars);
        System.out.println();

        //6
        int sevenCount = 0;
        for (String s : str) {
            int lengthOfString = s.length();
            if (lengthOfString == 7) {
                sevenCount++;
            }
        }

        if (sevenCount >= 2)
        {
            System.out.println("Two length 7!");
        }
        else
        {
            System.out.println("Under 2 length 7");

        }

        System.out.println();

        //8
        int hasE = 0;
        for(int i = 0; i< str.length; i++)
        {
            if (str[i].indexOf("e") != -1)
            {
                hasE++;
            }
        }

        System.out.println(hasE);

        System.out.println();

        //9
        int hasO = 0;
        for(int i = 0; i< str.length; i++)
        {
            if (str[i].indexOf("o") != -1)
            {
                hasO++;
            }
        }
        if (hasO == 0)
        {
            System.out.println("No o's!");
        }
        else
        {
            System.out.println("At least one o");

        }

        System.out.println();

        //10
        String[] responses = {"It is certain.","Outlook is not so good.", "Concentrate and ask again.","Without a doubt.", "My sources say no."};

        System.out.print("Enter your question >>> ");
        String user = console.nextLine();

        int num = random.nextInt(6);
        String response = responses[num];
        System.out.println(response);


    }
}