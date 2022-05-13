//Name: Eshan Iyer
//Period 4A

import java.util.*;

public class ChangeMakerAPP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        makeChange(10020.23, 13.44);
    }
    public static void makeChange(double paid, double cost)
    {
        int TwentyBills = 0;
        int TenBills = 0;
        int FiveBills = 0;
        int OneBills = 0;

        int TwentyFiveCents = 0;
        int TenCents = 0;
        int FiveCents = 0;
        int OneCents = 0;

        double change = paid - cost;

        int dollars = (int) change;

        double tempCents = (change - dollars)*100.0;

        tempCents = Math.round(tempCents*100.0)/100.0;
        int cents = (int) tempCents;


        if (dollars/20 > 0)
        {
            TwentyBills = dollars/20;
            int temp2 = 20*TwentyBills;
            dollars -= temp2;

        }
        if (dollars/10 > 0)
        {
            TenBills = dollars/10;
            int temp2 = 10*TenBills;
            dollars -= temp2;

        }
        if (dollars/5 > 0)
        {
            FiveBills = dollars/5;
            int temp2 = 5*FiveBills;
            dollars -= temp2;

        }

        OneBills = dollars;

        //---------------------------------------------------------------------------------------------------
        if (cents/25 > 0)
        {
            TwentyFiveCents = cents/25;
            int temp2 = 25*TwentyFiveCents;
            cents -= temp2;

        }
        if (cents/10 > 0)
        {
            TenCents = cents/10;
            int temp2 = 10*TenCents;
            cents -= temp2;

        }
        if (cents/5 > 0)
        {
            FiveCents = cents/5;
            int temp2 = 5*FiveCents;
            cents -= temp2;

        }
        OneCents = cents;


        System.out.println("$20: "+TwentyBills);
        System.out.println("$10: "+TenBills);
        System.out.println("$5: "+FiveBills);
        System.out.println("$1: "+OneBills);
        System.out.println();
        System.out.println("25¢: "+TwentyFiveCents);
        System.out.println("10¢: "+TenCents);
        System.out.println("5¢: "+FiveCents);
        System.out.println("1¢: "+OneCents);






    }
}