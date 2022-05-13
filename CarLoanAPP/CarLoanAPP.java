
/**
 * Program to get the approximate value of a car
 * 
 * @author (Eshan Iyer) 
 * @version (9/1/21)
 */
public class CarLoanAPP
{
    public static void main(String[] args)
    {
        // Stores the value of the "retail price" of the car
        double retailPrice = 25000;
      
        // The trade-in value of the car (the car you are going to exchange for the car you're buying)
        double tradeIn = 2000;
        
        // The downpayment of the car (how much cash you intend to give the dealership in addition to the trade)
        double downPayment = 3000; 
        
        // The financed amount of the car
        double financedAmount = retailPrice - (tradeIn + downPayment); 
        
        // Amount of intrest that builds up over time ($800 per $10K borrowed)
        double intrestAmount = (financedAmount/10000)*800;
        
        // Total financed amount of the car (intrest + financed amount)
        double totalFinanced = intrestAmount + financedAmount; 
        
        // Months: To calculate the monthly payment
        int months = 60;
        
        // Calculates the Monthly payment
        double monthlyPayment = totalFinanced/months;
        
        System.out.println("CAR LOAN PAYMENT APP");
        System.out.println("Retail price of car  $" + retailPrice);
        System.out.println("    Trade-in value  (" + tradeIn + ")");
        System.out.println("    Down payment  (" + downPayment + ")");
        System.out.println("Amount to finance   $" + financedAmount);
        System.out.println();
        System.out.println("Interest paid     " + "$" + intrestAmount);
        System.out.println();        
        System.out.println("Total financing     " + "$" + totalFinanced);
        System.out.println();        
        System.out.println("MONTHLY PAYMENT     " + "$" + monthlyPayment);        
        System.out.println("Spread out over " + months + " months" );
    }
} 