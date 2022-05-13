//Name:
//Period:
import java.util.*;

public class BinaryConversion
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int[] nums = {2, 4, 5, 8, 6, 2, 3, 5, 9, 0, 9, 6};

        //1
        int sum = 0;
        for (int i =0; i< nums.length;i++)
        {
            sum+=nums[i];
        }

        System.out.println();

        //2
        for (int i =0; i< nums.length;i++)
        {
            if (!(nums[i] % 2 == 0));
            {
                System.out.println("Found an odd!");
                break;
            }
        }

        System.out.println();

        //3

        boolean zero = false;
        for (int i =0; i< nums.length;i++)
        {
            if (nums[i] == 0)
            {
                System.out.println("Found a zero");
                zero = true;
                break;
            }
        }
        if (!zero)
            System.out.println("No zeros");

        System.out.println();

        //5
        int sixCount = 0;

        for (int i =0; i< nums.length;i++)
        {
            if (nums[i] == 6)
            {
                sixCount++;
            }
        }
        if (sixCount == 2)
        {
            System.out.println("Two 6s");
        }
        else
        {
            System.out.println("Less than two 6s");
        }

        System.out.println();
        //6
        boolean twoThree = false;

        for (int i =0; i< nums.length;i++)
        {

            if (nums[i] == 2 && nums[i + 1] == 3) {

                twoThree = true;
                break;
            }
        }
        if(twoThree)
        {
            System.out.println("Found 2/3");
        }
        else
        {
            System.out.println("No 2/3");
        }

        System.out.println();

        //7
        boolean inOrder = false;

        for (int i =0; i< nums.length-1;i++)
        {

            if (nums[i] <= nums[i+1] )
            {

                inOrder = true;
            }
            else
            {
                inOrder = false;
            }
        }
        if (inOrder)
        {
            System.out.println("In order");
        }
        else
        {
            System.out.println("Not in order");
        }

        System.out.println();

        //8
        int evenCount = 0;

        for (int i =0; i< nums.length;i++)
        {
            if (nums[i] % 2 == 0);
            {
                evenCount++;
            }
        }
        if (evenCount % 2 == 0)
        {
            System.out.println("Even evens");
        }
        else
        {
            System.out.println("Uneven evens");
        }

        System.out.println();

        //9
        boolean threeInARow = false;
        for (int i =0; i< nums.length-2;i++)
        {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {

                threeInARow = true;
                break;
            }
        }
        if (threeInARow)
        {
            System.out.println("Three in a row");
        }
        else
        {
            System.out.println("No three in a row");
        }

        System.out.println();

        //10
        int min = nums[0];
        int max = nums[0];
        for (int i =0; i< nums.length-1;i++)
        {
            min = Math.min(min,nums[i+1]);
            max = Math.max(max,nums[i+1]);

        }
        System.out.println(max-min);

    }
}