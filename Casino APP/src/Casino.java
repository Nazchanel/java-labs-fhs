import java.util.Scanner;

public class Casino {
    private Player player;

    private Roulette game = new Roulette();

    public Casino(String n, double w){
        player = new Player(n ,w);

    }

    public void play()
    {
        Scanner console = new Scanner(System.in);
        double bet = 0.00;      //User bet
        double result = 0.00;   //To store the winnings/losses of each
        String input = "";      //User input
        do
        {
            System.out.print(player.getName() + ", you have " +
                    player.getWallet() + ", how much would you like to bet? >>> ");
            bet = console.nextDouble();
//Play a round and store the results
            result = game.placeBet(bet);
            if (result > 0)
            {
                System.out.println("\nYou won " + result + "! Nice");
            }
            else
            {
                System.out.println("\nYou lost, bummer.");
            }
//Flush the buffer
            console.nextLine();
//Update wallet amount and notify user
            player.updateWallet(result);
            System.out.println("\nYou have $" + player.getWallet() + " in your wallet.");
            if (player.broke())
            {
                System.out.println("Come back when you have some money, chump.");
                return;
            }
            System.out.println("Bet again?  (Y or N) >>> ");
            input = console.nextLine();
        } while (!input.equalsIgnoreCase("N"));
    } //end method


}
