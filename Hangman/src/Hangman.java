//Name:
//Period:
import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] str = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
        String[] hiBye = {"byhigh", "hit", "byebye!", "hibye", "hilt"};
        int[] alpha = {5, 34, 3, -6, 7, 81, 1, 7, 5, 2, 2, 53, 4, 5, 62, 7};
        int[] beta = {1, 3, 4, 90, -4, 60, 12, 13, 4, -4, -1, 2, 4, 4, 9, 8};

        //2
        int numOfTimes = 0;

        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] - beta[i] <= 2) {
                numOfTimes++;
            }
        }
        System.out.println(numOfTimes);

        System.out.println();

        //3
        numOfTimes = 0;

        for (int i = 0; i < alpha.length - 1; i++) {
            if (alpha[i] == 2 && alpha[i + 1] == 2) {
                numOfTimes++;
            }
            if (alpha[i] == 4 && alpha[i + 1] == 4) {
                numOfTimes++;
            }
        }
        if (numOfTimes > 0) {
            System.out.println("Two/four!");
        } else {
            System.out.println("Not two/four!");
        }

        System.out.println();

        //4
        int[] gamma = new int[alpha.length];
        int gammaIndex = 0;

        for (int j = alpha.length - 1; j >= 0; j--) {
            gamma[gammaIndex] = alpha[j];
            gammaIndex++;
        }
        System.out.print("Reversed 'alpha': ");
        for (int i = 0; i < alpha.length; i++) {
            System.out.print(gamma[i] + " ");
        }
        System.out.println("\n");

        //5
        int min = 1;
        int max = 1;

        int min1 = 1;
        int max1 = 1;

        for (int i = 0; i < alpha.length - 1; i++) {
            min = Math.min(min, alpha[i + 1]);
            max = Math.max(max, alpha[i + 1]);
        }
        for (int i = 0; i < beta.length - 1; i++) {
            min1 = Math.min(min1, beta[i + 1]);
            max1 = Math.max(max1, beta[i + 1]);
        }
        int overallMin = Math.min(min, min1);

        int overallMax = Math.max(max, max1);
        int range = overallMax - overallMin;

        System.out.println("The range of 'alpha' and 'beta' is: " + range);
        System.out.println();

        //7
        int hiCount = 0;
        int byeCount = 0;
        for (int i = 0; i < hiBye.length; i++) {
            if (hiBye[i].indexOf("hi") != -1) {
                hiCount++;
            }
            if (hiBye[i].indexOf("bye") == -1) {
                byeCount++;

            }
        }
        if (hiCount == byeCount)
        {
            System.out.println("Same hi/bye");
        }
        else
        {
            System.out.println("Not same hi/bye");
        }

        int byeCount = 0;
        for(int i = 0; i < hiBye.length; i++)
        {
            for(int j = 0; j < hiBye[i].length() - 1; j++)
            {
                if(hiBye[i].substring(j, j + 2).equals("hi"))
                {
                    hiCount++;
                }
            }
            for(int j = 0; j < hiBye[i].length() - 2; j++)
            {
                if(hiBye[i].substring(j, j + 3).equals("bye"))
                {
                    byeCount++;
                }
            }
        }
        System.out.println("hi count >>> " + hiCount + "\nbye count >>> "
                + byeCount);
        if(hiCount == byeCount)
        {
            System.out.println("Same hi/bye");
        }
        else
        {
            System.out.println("Not same hi/bye");
        }
    }
}