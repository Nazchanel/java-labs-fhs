
/**
 * Find the specific salary with specific job details
 * 
 * @author (Eshan Iyer) 
 * @version (9/9/21)
 * @period (4A)
 */
public class SalariesAPP
{
    public static void main(String[] args)
    {
      
      // Variables representing the different inputs to the program
      
      double hourlyRate = 10;
 
      double hoursWorked = 40; 

      double overtimeHours = 10;
      
      double overtimePay = 1.5 * hourlyRate * overtimeHours;
      
      double taxRate = 0.25;
      
       
      // Salary without the Tax Rate
      
      double netSalary = (overtimePay + (hoursWorked * hourlyRate));  
      
      // Salary with Tax Rate
      
      double totalSalary = netSalary - (netSalary * taxRate);
      
      // Printing the variables
      
      System.out.println("Hourly rate >>> $" + hourlyRate);
      System.out.println("Regular hours worked >>> " + hoursWorked);
      System.out.println("Overtime hours worked >>> " + overtimeHours + "\n");
      
      System.out.println("Gross salary (total, before taxes) >>> $" + netSalary);
      System.out.println("Net salary (after taxes) >>> $" + totalSalary);



    }
}
