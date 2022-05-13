import java.util.Scanner;

public class Player {
    int roll;
    public int score;
    public String name;
    

    Scanner console = new Scanner(System.in);
    public  Player(String pname)
    {
        name = pname;
        score = 0;

    }

    public void takeTurn(Die d)
    {

        boolean turnActive = true;
        int rollTotal = 0;
        while (turnActive) {
            roll = d.roll();
            String response;

            if (roll == 1) {
                rollTotal = 0;
                System.out.println("You rolled a PIG! Bummer.");
                turnActive = false;
                continue;
            }
            System.out.println();

            System.out.println(name + ", your current score is " + score);
            System.out.println("You rolled a " + roll);
            rollTotal += roll;

            System.out.print("Turn total = " + rollTotal + ", roll or hold >>> ");
            response = console.nextLine();

            System.out.println();

            if (response.equalsIgnoreCase("hold")) {
                score += rollTotal;
                rollTotal = 0;
                turnActive = false;
            }
        }
    }

}
