//Name:
//Period:
import java.util.*;

public class NumberHistogram
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int[] nums = {2, 4, 5, 8, 16, 2, 3, 5, 9, 0, 9, 12, 6};

        //2
        System.out.println("2: " + nums[0]);

        System.out.println();

        //3
        System.out.println("3: " + nums[1]);

        System.out.println();

        //4
        System.out.println("4: " + nums[3]);

        System.out.println();

        //5
        System.out.println("5: "+nums[nums.length-1]);

        System.out.println();

        //6
        System.out.println("6: "+ nums.length);

        System.out.println();

        //7
        System.out.println("7: "+nums[nums.length-1]);

        System.out.println();

        //9
        for (int i=0; i< nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }

        System.out.println();

        //10
        if (nums[nums.length-1] == 6 || nums[0] == 6)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        //11



    }
}