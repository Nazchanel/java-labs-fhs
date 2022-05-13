import java.util.Scanner;

public class PigGame {
    Scanner console = new Scanner(System.in);
    private Player player1;
    private Player player2;
    private Die die;
    private int goal;

    public PigGame(int goalPoints) {
        die = new Die();
        System.out.print("Player 1, enter your name >>> ");
        player1 = new Player(console.nextLine());

        System.out.print("Player 2, enter your name >>> ");
        player2 = new Player(console.nextLine());

        goal = goalPoints;
    }

        public void play()
        {
            while (true) {
                player1.takeTurn(die);

                if (player1.score >= goal) {
                    System.out.println("Congrats! " + player1.name + " won the game.");
                    break;
                }

                player2.takeTurn(die);

                if (player2.score >= goal) {
                    System.out.println("Congrats! " + player2.name + " won the game.");
                    break;
                }
            }
            return;

        }
        public void printInstructions()
    {
            System.out.println();
            System.out.println("In the game of Pig, two players roll a die until one player reaches "+ goal +" points.\n" +
                    "Each turn, one player keeps rolling until they either \"hold\" or roll a 1.\n" +
                    "If a player rolls a 1, they lose all the points they've accumulated that turn are added to their score");
        }


    }


