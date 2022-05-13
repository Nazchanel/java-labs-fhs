//Name:
//Period:
import java.util.*;

public class TShirtLauncher
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        //1
        System.out.print("Enter the value of x >>> ");
        double x = console.nextDouble();

        System.out.print("Enter the value of y >>> ");
        double y = console.nextDouble();

        double value = Math.PI * (Math.pow(x,6) - Math.pow(y,6));

        System.out.println(value);

        //2
        System.out.print("Enter the value of radius >>> ");
        double radius = console.nextDouble();
        value = (4/3) * Math.PI *Math.pow(radius, 3);

        System.out.println(value);

        //3
        System.out.print("Enter the value of zee >>> ");
        double zee = console.nextDouble();

        value = Math.abs(Math.pow(zee,4) - 1);

        //4

    }

}