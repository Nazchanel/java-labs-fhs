//Name: Eshan
//Period: 4A
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.*;

public class HangmanAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String[] str = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};
        int[] alpha = {5, 34, 3, -6,  7, 81, 1,  7,  5,  2,  2, 53, 4, 5, 62, 7};
        int[] beta = {1, 3,  4, 90, -4, 60, 12, 13, 4, -4, -1,  2, 4, 4,  9, 8};

        int extraGuesses = 3;

        String[] secretWord = {"p", "o", "o", "p"};
        String [] masked = new String[secretWord.length];

        //Stores all the guesses made
        String [] guesses = new String[secretWord.length+extraGuesses];

        for (int i = 0; i < secretWord.length; i++)
        {
            masked[i] = "_";
        }
        for (int i = 0; i < guesses.length; i++)
        {
            guesses[i] = "_";
        }
        boolean guessed = true;
        boolean failed = true;

        int guessCount = 0;


        while (guessed && failed)
        {
            System.out.println("---------------------------------------------------------");
            System.out.println("Here is the current set of words:\n");
            System.out.println("You have " + ((secretWord.length+extraGuesses)-guessCount) + " guesses left.\n");

            // Prints the current guessed letters
            System.out.print("[");
            for (int i = 0; i < masked.length; i++)

            {
                if (i == masked.length-1)
                {
                    System.out.print(masked[i]);
                }
                else {
                    System.out.print(masked[i] + ", ");
                }
            }
            System.out.println("]\n");
            System.out.println("---------------------------------------------------------");
            int index = 0;
            boolean validGuess = false;
            String guess = " ";
            while (!validGuess)
            {
                System.out.print("Enter your guess >>> ");
                guess = console.nextLine();
                int matchCount = 0; // Creates a variable to keep track of the times it matches
                for (int i = 0; i < guesses.length; i++) {
                    if (guesses[i].contains(guess))
                    {
                        matchCount++;
                    }
                }
                if (matchCount < 1)
                {
                    guesses[index] = guess;
                    index++;
                    validGuess = true;


                }
                else
                {
                    System.out.println("Invalid response. Enter a character that you haven't already entered.\n");
                }
            }

            // Checks to see if there is a matching letter and replaces the index to masked
            for (int i = 0; i < secretWord.length;i++)
            {
                if (secretWord[i].contains(guess))
                {
                    masked[i] = guess;
                }
            }
            int correctCount = 0; // Creates a variable to keep track of the times it matches
            for (int i = 0; i < masked.length; i++)
            {
                if (secretWord[i].contains(masked[i]))
                {
                    correctCount++;
                }
            }

            // If every letter in masked equals the letters in the original secret word
            if (correctCount == secretWord.length)
            {
                guessed = false;
            }

            guessCount++;

            if (guessCount >= secretWord.length+extraGuesses)
            {
                failed = false;
            }
        }
        if (!guessed) {
        System.out.println("\n---------------------------------------------------------");
        System.out.println("Congratulations you won!");
        System.out.println("---------------------------------------------------------");
        }
        else if (!failed)
        {
            System.out.println("\n---------------------------------------------------------");

            System.out.println("Unfortunately, you ran out of attempts.\n\nThis is the correct answer:\n");
            for (String s : secretWord) {
                System.out.print(s);
            }
            System.out.println("\n---------------------------------------------------------");

        }


    }
}