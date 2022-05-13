
/**
 * Calculates the BMI with the given input
 * 
 * @author (Eshan) 
 * @version (9/15/21)
 * @period (4A)
 */
import java.util.*;
public class BMI_APP
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter height in inches >>> ");
        double height = console.nextDouble();
        
        // Converting inches to meters
        height/=39.37;
        
        System.out.println("Enter weight in pounds >>> ");
        double weight = console.nextDouble();
        
        // Converting pounds to kilograms 
        weight/=2.205;
        
        // Taking the inputs and calculating the BMI
        double bmi = weight/(height * height);  

        System.out.println("Your BMI is >>> " + bmi);
    }
} 
