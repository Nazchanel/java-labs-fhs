public class ApproximatePI_APP {
    public static double main (int iterations)
    {
        double denominator = 1.0;

        double sum = 0;

        for (int i = 0; i < iterations; i++)
        {
            if (i %2 != 0)
            {
                sum-= 1/denominator;

            }
            else
            {
                sum+= 1/denominator;
            }
            denominator+=2.0;

        }
        sum*=4;
        return sum;
    }

    public static void main(String[] args)
    {
        System.out.print(main(10000000));

    }
}
