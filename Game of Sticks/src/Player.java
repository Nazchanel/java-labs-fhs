import java.util.*;
public class Player {
    Scanner console = new Scanner(System.in);

    int totalSticks = 0;

    public int takeTurn(int s)
    {
        int response = -1;
        while (true) {

        System.out.print("How many sticks do you want to pick up? (Enter 1, 2, 3) >>> ");
        response = console.nextInt();
        if (response >= 1 && response <= 3)
        {
            break;

        }
        else
        {
            System.out.println("\nEnter a valid number!");
        }

        }
        totalSticks += response;
        return response;
    }
    public int returnTotalSticks()
    {
        return totalSticks;
    }
}


