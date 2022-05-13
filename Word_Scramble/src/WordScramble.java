public class WordScramble {
    public static void main(String[] args) {

    }
    //1
    public static boolean isLetterA(char letter)
    {

        return letter == 'a';
    }

    //2
    public static boolean hasTwoA(String str)
    {
        int aCount = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'a')
                aCount++;

        }

        return aCount == 2;
    }

    //3
    public static boolean isVowel(char letter)
    {
        letter = Character.toLowerCase(letter);

        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';

    }

    //4
    public static int numVowels(String str)
    {
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++)
        {
            if (isVowel(str.charAt(i)))
            {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    //5
    public static boolean equalChars(String str, char alpha, char beta)
    {
        int betaCount = 0;
        int alphaCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == alpha)
            {
                alphaCount++;
            }
            if (currentChar == beta)
            {
                betaCount++;
            }

        }
        return betaCount == alphaCount;

    }

    //6
    public static boolean twoInARow(String str, char alpha)
    {

        int alphaCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar == alpha)
            {
                alphaCount++;
            }

        }
        return alphaCount == 2;
    }

    //7
    public static String capitalizeVowels(String str)
    {
        String vowelsCapitalized = "";

        for (int i = 0; i < str.length(); i++)
        {
            char currentChar = str.charAt(i);
            if (isVowel(currentChar))
            {
                vowelsCapitalized += (Character.toUpperCase(currentChar));
            }
            else
            {
                vowelsCapitalized += currentChar;
            }

        }
        return vowelsCapitalized;

    }

    //8
    public static String longestWord(String sentence)
    {
        int wordLength = 0;
        String longestWord = "";
        String[] splitSentence = sentence.split(" ");
        for (int i = 0; i<splitSentence.length; i++)
        {
            String currentString = splitSentence[i];
            int currentStringLength = currentString.length();

            if (currentStringLength > wordLength)
            {
                longestWord = currentString;
            }

        }
        return longestWord;

    }

    //9
    public static boolean containsPrefix(String str, int num)
    {
        String prefix = str.substring(0,num);

        for (int i = num; i<str.length()-num; i++)
        {
            String currentLetters = str.substring(i, i+num);
            if (currentLetters.equals(prefix)) {
                return true;
            }

        }
        return false;


    }
}
