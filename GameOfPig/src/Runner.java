import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter goal points >>> ");
        int goalPoints = console.nextInt();

        PigGame pigGame = new PigGame(goalPoints);

        pigGame.printInstructions();

        pigGame.play();

    }

}
