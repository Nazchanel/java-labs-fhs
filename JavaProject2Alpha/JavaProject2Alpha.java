
/**
 * Write a description of class JavaProject2Alpha here.
 * 
 * @author (Eshan Iyer) 
 * @version (9/17/21)
 * @period (4B)
 */
public class JavaProject2Alpha
{
   public static void main(String[] args)
   {
      //----------------------------- 
      // Challenges (10 points each)
      //-----------------------------
      System.out.println("----------------------------- ");
      
      System.out.println("Challenges: ");
      
      System.out.println("----------------------------- ");
      
      System.out.println();
      // 1) Declare an integer variable named radius and initialize it to 17
      
      int radius = 17;
      
      // 2) Declare a double variable named pi and initialize it to 3.14159
      
      double pi = 3.14159;
      
      // 3) Declare a double variable named areaOfACircle and set it to calculate the area of a circle
      
      // A = ∏r^2
      
      double areaOfACircle = pi * (radius * radius);
      
      // 4) Print the radius of the circle with the variable previosly defined/initialized
      
      System.out.println("The circle’s radius equals " + radius + ".");
      
      System.out.println();
      // 5) Printing the area of the circle with given radius
      
      System.out.println("The circle’s area equals " + areaOfACircle +".");
      System.out.println();
      // 6) Declare int variables, sideA and sideB, and initialize them to 7 and 11
      
      int sideA = 7;
      int sideB = 11;
      
      // 7) Declare String variables hello, world, and goodbye. Initialize them to “Hello”, “World”, and “Goodbye” 
      
      String hello = "Hello";
      String world = "World";
      String goodbye = "Goodbye";
      
      // 8) Using one print statement to print the values of the variables hello, world, and goodbye in a concatenated string
      
      System.out.println(hello + ", " + world + "... " + goodbye);
      
      // Spacing
      
      System.out.println();
     
      //--------------------------------- 
      // Sales Commission App (20 points) 
      //---------------------------------
      System.out.println("----------------------------- ");
      
      System.out.println("Sales Commission App: ");
      
      System.out.println("----------------------------- ");
       
      System.out.println();
      
      // Making five new double variables: regularSalary, totalSales, commissionRate, totalCommission, and totalSalary.
      
      double regularSalary = 2000;
      
      double totalSales = 1400000;
      
      double commissionRate = 0.003;
      
      double totalCommission = totalSales * commissionRate;
      
      double totalSalary = totalCommission + regularSalary;
 
      // Printing the variables to the console with concatenated text
      
      System.out.println("Regular Salary >>> $" + regularSalary);
      
      System.out.println("Total Sales >>> $" + totalSales);
      
      System.out.println("Commission Rate >>> " + commissionRate);
      
      System.out.println("Total Commission >>> $" + totalCommission + "\n");
      
      System.out.println("Total Salary >>> $" + totalSalary);
      
   }
}