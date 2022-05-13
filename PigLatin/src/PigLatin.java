//Name:
//Period:
import java.util.*;

public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        //1
        System.out.print("1: Enter a String >>> ");
        String str = console.nextLine();
        System.out.println((str.substring(0,1)).toUpperCase() + str.substring(1));

        System.out.println();

        //2
        System.out.print("2: Enter a String >>> ");
        str = console.nextLine();

        str = str.toLowerCase();
        String strUpper = (str.substring(str.length()-2)).toUpperCase();
        System.out.println(str.substring(0,str.length()-2)+ strUpper);

        System.out.println();

        //3
        System.out.print("3: Enter a String >>> ");
        str = console.nextLine();

        int eCount = 0;

        for (int i =0; i < str.length(); i++)
        {
            if (str.substring(i,i+1).equals("e") || str.substring(i,i+1).equals("E"))
            {
                eCount++;
            }

        }

        System.out.println("The letter 'e' was present " + eCount + " time or times.");

        System.out.println();

        //4
        System.out.print("4: Enter a String >>> ");
        str = console.nextLine();

        int hiCount = 0;

        for (int i =0; i < str.length()-1; i++)
        {
            if (str.substring(i,i+2).equals("hi"))
            {
                hiCount++;
            }
        }
        System.out.println("\"hi\" was present " + hiCount + " time or times.");

        System.out.println();

        //5
        System.out.print("5: Enter a String >>> ");
        str = console.nextLine();

        System.out.print("5: Enter the target >>> ");
        String target = console.nextLine();


        boolean targetFound = false;

        int targetLength = target.length();

        for (int i =0; i < str.length()-targetLength-1; i++)
        {
            if (str.substring(i, i + targetLength).equals(target)) {
                targetFound = true;
                break;
            }
        }
        if (targetFound)
        {
            System.out.println("Found it!");
        }
        else
        {
            System.out.println("Nope!");
        }

        System.out.println();

        //6
        System.out.print("6: Enter a String >>> ");
        str = console.nextLine();

        System.out.print("6: Enter an integer >>> ");
        int num = console.nextInt();
        console.nextLine();

        String lastLetters = str.substring(str.length()-num);

        for(int i = 0; i<num;i++)
        {
            System.out.print(lastLetters);
        }

        System.out.println("\n");

        //7
        System.out.print("7: Enter your email >>> ");
        String email = console.nextLine();
        String domain = email.substring(email.indexOf("@")+1);
        System.out.println(domain);

        System.out.println();

        //8
        System.out.print("8: Enter your full name >>> ");
        String fullName = console.nextLine();

        int spaceIndex = fullName.indexOf(" ");

        System.out.println(fullName.substring(0,spaceIndex));

        System.out.println();

        //10
        System.out.print("10: Enter a String >>> ");
        str = console.nextLine();

        String result = "";

        char charRemove = '*';

        char charAtIndex;

        for(int i = 0; i<str.length();i++)
        {
            charAtIndex = str.charAt(i);
            if (!(charAtIndex == charRemove))
            {
                result+=charAtIndex;
            }
        }


        System.out.println(result);





    }
}