//Name:
//Period:
import java.util.*;

public class TShirtLauncher
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        //1
        System.out.print("Enter the value of a double >>> ");
        double x = console.nextDouble();

        System.out.print("Enter the value of another double >>> ");
        double y = console.nextDouble();

        System.out.println(Math.PI*(Math.pow(x,6)-Math.pow(y,6)));

        System.out.println();

        //2
        System.out.print("Enter the value of \"radius\" >>> ");
        double radius = console.nextDouble();

        System.out.println(4/3*(Math.PI*Math.pow(radius,3)));
        System.out.println();

        //3
        System.out.print("Enter the value of \"zee\" >>> ");
        double zee = console.nextDouble();

        System.out.println(Math.abs(Math.pow(zee,4)-1));

        System.out.println();

        //4
        System.out.print("Enter the value of a double >>> ");
        x = console.nextDouble();

        System.out.println(Math.log(Math.abs(1+x)));

        System.out.println();

        //5
        System.out.print("Enter the value of a double >>> ");
        x = console.nextDouble();

        System.out.println(Math.pow(x,2)*Math.exp(x));

        System.out.println();

        //6
        System.out.print("Enter the value of a double >>> ");
        double a = console.nextDouble();

        System.out.print("Enter the value of a double >>> ");
        double b = console.nextDouble();

        System.out.println(Math.sqrt(Math.pow(a,2)-Math.pow(b,2)));

        System.out.println();

        //8
        System.out.print("Enter the value of a \"bearing\" >>> ");
        double bearing = console.nextDouble();

        bearing = Math.round(bearing/10);

        System.out.println("The runway number is: " + bearing);

        System.out.println();

        //9
        System.out.print("Enter the value of a \"i\" >>> ");
        int i = console.nextInt();

        System.out.print("Enter the value of a \"j\" >>> ");
        int j = console.nextInt();

        System.out.print("Enter the value of a \"k\" >>> ");
        int k = console.nextInt();

        System.out.println("The smallest value entered is >>> "+Math.min(Math.min(i,j),k));





    }
}
