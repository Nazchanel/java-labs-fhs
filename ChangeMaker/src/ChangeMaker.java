import java.util.*;

public class ChangeMaker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //1
        System.out.print(simpleSearch(new int[]{8, 6, 7, 4, 3, 6, 5}, 7));

        System.out.println();

        //2
        squareBoard(2);

        System.out.println();

        //3
        checkerBoard(3);

        System.out.println();

        //4
        printPow2(4);
        System.out.println();

        //5
        System.out.println("The converted temperature is " + convertTemp(23, true) + " degrees." );
        System.out.println();

        //6
        System.out.println(isArmstrong(371));
        System.out.println();

        //7
        System.out.println(contains(new int[]{1, 2, 1, 2, 3}, new int[]{1, 2, 3}));

        System.out.println();


    }

    private static boolean isArmstrong(int num) {
        String numInString = Integer.toString(num);
        int numDigits = numInString.length();

        int sum = 0;
        for (int i = 0; i < numDigits; i++)
        {
            int currentNum = Integer.parseInt(numInString.substring(i, i+1));
            sum += Math.pow(currentNum, 3);

        }

        return sum == num;
    }

    public static int simpleSearch(int[] nums, int value) {
        int valueIncluded = -1;

        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            if (currentValue == value) {
                valueIncluded = i;
                return valueIncluded;

            }
        }
        return Math.min(valueIncluded, 0);
    }

    public static void squareBoard(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("# ");

            }
            System.out.println();
        }
    }

    public static void checkerBoard(int num) {
        boolean tab = false;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (tab) {
                    System.out.print(" ");
                }
                System.out.print("# ");

            }
            System.out.println();

            tab = !tab;
        }
    }

    public static void printPow2(int num) {
        System.out.println("Here are the first " + num + " of 2:");
        for (int i = 0; i < num; i++) {
            double power = Math.pow(2, i);
            System.out.println("2^" + i + " = " + (int) power);
        }


    }

    public static boolean contains(int[] alpha, int[] beta) {
        boolean isSubArray = false;
        for (int i = 0; i < alpha.length; i++) {
            if (beta[i] == alpha[i]) {

                for (int j = i; j < beta.length; j++) {
                    isSubArray = beta[i] == alpha[j];
                }
                break;
            }
        }
        return isSubArray;
    }

    public static double convertTemp(double temp, boolean isF) {

        double convertedTemp = 0.0;
        if (isF)
        {
            convertedTemp = (temp - 32) * (5.0 / 9.0);


        }
        else
        {
            convertedTemp = (temp * (9.0/5.0)) + 32;

        }

        return convertedTemp;
    }


}
