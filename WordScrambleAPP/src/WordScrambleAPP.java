//Name:
//Period:
import java.util.*;

public class WordScrambleAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your string to jumble >>> ");
        String input = console.nextLine();

        System.out.println(wordScramble(input));
    }

    public static String wordScramble(String sentence)
    {
        char firstChar = sentence.charAt(0);

        char lastChar = 'X';
        char startChar = 'X';

        int endIndex = 0;
        int startIndex = 0;
        for(int i = sentence.length()-1; i > 0; i--)

        {
            lastChar = sentence.charAt(i);
            if (Character.isLetter(lastChar))
            {
                endIndex = i;
                break;

            }

        }
        for(int i = 0; i < sentence.length(); i++)

        {
            startChar = sentence.charAt(i);
            if (Character.isLetter(startChar))
            {
                startIndex = i;
                break;

            }

        }

        String pureSentence = sentence.substring()





        }
    }
