//Name:
//Period:
import java.util.*;

public class BlackjackAPP
{
    public static void main(String[] args)
    {
        boolean main = true;
        Scanner console = new Scanner(System.in);
        Random randomGen = new Random();





        while(main){
            System.out.println("Would you like to play a game of Blackjack?");
            String returning = console.next();

            if (returning.equals("no"))
            {
                main = false;
                continue;
            }

            int cardValue = randomGen.nextInt(10) + 2;
            int cardValue1 = randomGen.nextInt(10) + 2;
            int player = cardValue + cardValue1;

            int dealerValue = randomGen.nextInt(10) + 2;
            int dealerValue1 = randomGen.nextInt(10) + 2;
            int dealer = dealerValue + dealerValue1;

            int hit;

            System.out.println("Your card values are " + cardValue + " and " + cardValue1 + ".");
            boolean runner = true;


            while (runner) {
                System.out.print("Do you want to hit or stay? ");
                String hitOrTake = console.next();
                console.nextLine();
                if (hitOrTake.equals("hit")) {
                    hit = randomGen.nextInt(10) + 2;
                    player += hit;
                    System.out.println("Your card value is " + player);
                }

                if (dealer <= 14) {
                    hit = randomGen.nextInt(10) + 2;
                    dealer += hit;
                }
                    // Compare the values
                    if (dealer >= 21) {
                        System.out.println("Bust on dealer. You win!");
                        runner = false;
                    }
                    else if (player >= 21) {
                        System.out.println("Bust. You lose!");
                        runner = false;
                    }
                    else if (dealer > player) {
                        System.out.println("Dealer loses. You win!");
                        runner = false;

                    }
                    else if (player > dealer) {
                        System.out.println("You lose.");
                        runner = false;

                    }
                    else {
                        System.out.println("It's a tie!");
                        runner = false;

                    }

            }



        }



    }
}