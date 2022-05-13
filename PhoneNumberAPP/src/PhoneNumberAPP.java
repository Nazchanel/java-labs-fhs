//Name:
//Period:
import java.util.*;

public class PhoneNumberAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter phone String >>> ");
        String phoneNumber = console.nextLine();

        System.out.println();

        System.out.print("Actual number >>> " + numberToString(phoneNumber));
    }
    public static String numberToString(String phoneNumber)
    {
       int[] numberConversion = {2, 3, 4, 5, 6, 7, 8, 9};
       char[] split = phoneNumber.toCharArray();

       StringBuilder finalString = new StringBuilder();

        for (char c : split) {
            switch (c) {
                case 'A', 'B', 'C' -> finalString.append(numberConversion[0]);
                case 'D', 'E', 'F' -> finalString.append(numberConversion[1]);
                case 'G', 'H', 'I' -> finalString.append(numberConversion[2]);
                case 'J', 'K', 'L' -> finalString.append(numberConversion[3]);
                case 'M', 'N', 'O' -> finalString.append(numberConversion[4]);
                case 'P', 'Q', 'R', 'S' -> finalString.append(numberConversion[5]);
                case 'T', 'U', 'V' -> finalString.append(numberConversion[6]);
                case 'W', 'X', 'Y', 'Z' -> finalString.append(numberConversion[7]);
                default -> finalString.append(c);
            }
        }
        finalString.insert(9, '-');
        return finalString.toString();
    }

}
