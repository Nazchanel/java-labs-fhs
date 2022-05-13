
/**
 * A basic version of Black Jack with input
 * 
 * @author (Eshan Iyer) 
 * @version (10/1/21)
 * @period (4A)
 */
import java.util.*;

public class BasicBlackJackAPP
{
   public static void main(String[] args)
   {
       Scanner console = new Scanner(System.in);
       System.out.println("Player 1, Enter you hand value >>>");
       int hand1 = console.nextInt();
       console.nextLine();
       
       System.out.println("Player 2, Enter you hand value >>>");
       int hand2 = console.nextInt();
       console.nextLine();
       
       if (hand2 > 21 && hand1 > 21)
       {
           System.out.println("Bust!");
        }
       else if (hand1 > 21)
       {
           System.out.println("Player 2 wins!");
        }
       else if (hand2 > 21)
       {
           System.out.println("Player 1 wins!");
        }
       else
       {
           System.out.println("Tie!");
        }
   }
}