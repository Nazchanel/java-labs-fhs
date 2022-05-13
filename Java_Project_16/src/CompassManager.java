// Name: Eshan Iyer
// Period: 4A
// Date: 5-3-22
// Description:
// Acts as a runner class for the Compass class.

import java.util.*;
public class CompassManager

{
    public static void main(String [] args) {
        Compass compass = new Compass();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("* Compass Test *");
        System.out.println("**********************");
        System.out.println();
        int sel = 0;
        do {
            System.out.println("================================");
            System.out.println(" Current Heading = " +
                    compass.getHeading()
            );
            System.out.println(" Current Direction = " +
                    compass.getDirection()
            );
            System.out.println("================================");
            System.out.println();
            System.out.println("1. Turn Right One Degree");
            System.out.println("2. Turn Left One Degree");
            System.out.println("3. Turn (degrees)");
            System.out.println("4. Quit");
            System.out.println();
            System.out.print("Make selection -->");
            sel = keyboard.nextInt();
            if (sel == 1) {
                compass.turnRight();
            }
            if (sel == 2) {

                compass.turnLeft();
            }
            if (sel == 3) {
                System.out.println();
                System.out.print("Enter degrees (- turns left, + turns right) -- >");
                int degrees = keyboard.nextInt();
                compass.turnDegrees(degrees);
            }
        }
        while (sel < 4);
    }
    }