import java.util.*;
public class PatternsWithForLoops {

    public static void main(String[] args) {
        //1

        String star = "* ";

        for(int i = 0; i < 5; i++)

        {
            for(int j = 1; j<10; j++)
            {
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println();

        //2


        for(int i = 1; i < 7; i++)

        {
            for(int j = 1; j<i; j++)
            {
                System.out.print(star);
            }
            System.out.println();
        }

        System.out.println();

        //3

        int iter = 1;

        for(int i = 1; i < 6; i++)

        {
            for(int j = i; j<5; j++)
            {

                System.out.print(star);
            }
            System.out.print(i);
            System.out.println();
        }

        System.out.println();

        for(int i = 1; i < 6; i++)

        {
            for(int j = i; j<5; j++)
            {

                System.out.print(star);
            }
            for(int k = 0; k<i; k++)
            {
                System.out.print(i);
            }
            System.out.println();
        }



    }
}
