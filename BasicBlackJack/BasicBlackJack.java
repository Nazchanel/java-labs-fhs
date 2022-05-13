
/**
 * Practices if statements and makes a game and a triangle calculator
 * 
 * @author (Eshan Iyer) 
 * @version (9/29/21)
 * @period (4B)
 */
import java.util.*;

public class BasicBlackJack
{
   public static void main(String[] args)
   {
       Scanner console = new Scanner(System.in);
       
       // Challenge 2
       
       System.out.println("Value of apples >>>  ");
       int apples = console.nextInt();
       if (apples >= 0)
       {
           System.out.println("Hello world!");
        }
        
       // Challenge 3 & 4
       
       System.out.println("Value of apples >>>  ");
       apples = console.nextInt();
       
       if (apples % 2 == 0)
       {
           System.out.println("Omg it's even!");
        }
       else if (apples % 2 != 0)
       {
           System.out.println("Hmm that's odd!");
        } 
       
        
       // Challenge 5
       
       int votingAge = 18;
       System.out.println("Actual age >>>  ");
       int actualAge = console.nextInt();
       
       if (actualAge >= votingAge)
       {
           System.out.println("You can vote");
        }
       else
       {
           System.out.println("You can't vote");
        }
       
       // Challenge 6
       
       System.out.println("Angle 1 >>>  ");
       int angle1 = console.nextInt();
       System.out.println("Angle 2 >>>  ");
       int angle2 = console.nextInt();
       System.out.println("Angle 3 >>>  ");
       int angle3 = console.nextInt();
       
       if (angle1 + angle2 + angle3 > 180 || angle1 + angle2 + angle3 < 180 )  {      
          System.out.println("Error");   
        }   
       else if (angle1 == angle2 && angle2 == angle3)
       {
          System.out.println("Equilateral");   
        }   
       else if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1 )   
       {
          System.out.println("Isoceles");   
        }   
       else   
       {
          System.out.println("Scalene");  
        }
          
       // Challenge 8
      
       System.out.println("Player 1:\nChoose 1 for paper, 2 for rock, or 3 for scissors >>>");
       int player1 = console.nextInt();
       System.out.println("Player 2:\nChoose 1 for paper, 2 for rock, or 3 for scissors >>>");
       int player2 = console.nextInt();
       System.out.print("\n"); 
       if (player1 > 3 || player1 < 1 && player2 > 3 || player2 < 1)
       {
          System.out.println("Error");   
       }
       else if (player1 == 3 && player2 == 1)  
       {      
          System.out.println("Scissors cuts paper! Player 1 wins");   
        }  
       else if (player2 == 3 && player1 == 1)  
       {      System.out.println("Scissors cuts paper! Player 2 wins");  
         }  
       else if (player1 == 1 && player2 == 2)  
       {      System.out.println("Paper covers rock! Player 1 wins");   
        }
       else if (player2 == 1 && player1 == 2)  
       {      System.out.println("Paper covers rock! Player 2 wins");  
        }
       else if (player1 == 2 && player2 == 3)  
       {       System.out.println("Rock smashes scissors! Player 1 wins");   
        }    
       else if (player2 == 2 && player1 == 3)   
       {       System.out.println("Rock smashes scissors! Player 1 wins\n");   
        } 
    }
} 