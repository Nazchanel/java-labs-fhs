public class GameOfSticks {
    private Computer computer;
    private int numberOfSticks;
    private Player player;
    private int sticksTaken;


    public GameOfSticks()
    {
        computer = new Computer();
        player = new Player();
        numberOfSticks = 20;
        sticksTaken = 0;
    }
    public void play()
    {
        while (true)
        {
            System.out.println("\nThere are " + numberOfSticks + " sticks on the board.");
            numberOfSticks -= player.takeTurn(numberOfSticks);

            if (numberOfSticks <= 0)
            {
                System.out.println("\nYou won the game!\n");
                break;
            }
            System.out.println("\nThere are " + numberOfSticks + " sticks on the board.");

            sticksTaken = computer.takeTurn(numberOfSticks);
            numberOfSticks -= sticksTaken;

            if (numberOfSticks <= 0)
            {
                System.out.println("\nThe computer won the game!\n");
                break;
            }
            System.out.println("The computer took " + sticksTaken + " from the board.");

        }

    }
    public void printSticksTaken()
    {
        int playerSticks = player.returnTotalSticks();
        int computerSticks = computer.returnTotalSticks();

        System.out.println("You picked up " + playerSticks + " total sticks from the board.");
        System.out.println("The computer picked up " + computerSticks + " total sticks from the board.");
    }

    public void printInstructions()
    {
        System.out.println("""
                Welcome to the Game of Sticks!

                Directions: There are 20 sticks on the board. You will be playing against the computer. You will be taking your turn first. You will enter a number between 1 and 3 to remove sticks.
                Then the computer will randomly generate a number between 1 and 3 to remove its sticks off the board. This repeats until all sticks are removed.
                The last one to remove the last stick off the board loses the game. Let's get started!
                """);
    }

}
