
/**
 * Practice using input statements.
 * 
 * @author (Eshan Iyer) 
 * @version (9/13/21)
 * @period (4A)
 */
import java.util.*;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        //1
        
        // Adding 10 to a inputted integer
        
        System.out.print("Enter an integer >>> ");
        int num1 = console.nextInt();
        console.nextLine();
        num1+=10;
        System.out.println("\nYour number plus ten is: " + num1);
        
        //2
        
        // Entering name and printing a greeting with the input
        
        System.out.print("\nEnter your name >>> ");
        String name1 = console.next();
        console.nextLine();
        System.out.println("\nHello, " + name1 + "!\n");
        
        //3
        
        // Squaring a double value inputted by the user
        
        System.out.print("Enter a double >>> ");
        double something = console.nextDouble();
        console.nextLine();
        System.out.println("\nSomething squared is: " + (something * something));
        
        //5
        
        // Printing a greeting with the age and a newly inputted name
        
        System.out.print("\nEnter your name again >>> ");
        String name2 = console.next();
        console.nextLine();
        System.out.print("\nEnter your age >>> ");
        int age = console.nextInt();
        console.nextLine();
        System.out.println("\n"+name2+" is "+ age + " years old");
        
        //6
        
        // Calculating the area of a circle with an inputted radius
        
        System.out.print("\nEnter the radius of a circle (double) >>> ");
        double radius = console.nextDouble();
        console.nextLine();
        double pi = 3.14159;
        double areaCircle = pi*(radius*radius);
        System.out.println("\nThe area of the circle with the given radius is: "+areaCircle); 
        
        //7
        
        // Determines how far an object travels with the inputted seconds of free fall
        
        System.out.print("\nEnter the number of seconds of free fall >>> ");
        double time = console.nextDouble();
        console.nextLine();
        System.out.println("Distance traveled >>> "+ ((time * time) * (32.174 / 2))); 
        
        //8
        
        // Prints the value of the first inputted name 3 times without space
        
        System.out.println("\n" + name1 + name1 + name1);  
        
    }
} 
