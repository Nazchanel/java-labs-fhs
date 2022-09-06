import java.util.*;
public class Computer {
    Random random = new Random();
    int totalSticks = 0;

    public int takeTurn(int s)
    {
        //If there are 3 remaining sticks left on the board, then the computer will choose to remove 2 sticks.
        //If there are 2 or 1 remaining stick left on the board, then the computer will choose to remove 1 stick.
        if (s == 3)
        {
            return s -= 3;
        }
        if (s == 1 || s == 2)
        {
            return s -= 1;
        }

        int sticksTaken = (random.nextInt(3) + 1);

        totalSticks += sticksTaken;

        return sticksTaken;
    }
    public int returnTotalSticks()
    {
        return totalSticks;
    }


}
