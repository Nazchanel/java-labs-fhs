import java.util.*;
public class Roulette {
    public double placeBet(double bet) {
            Random rand = new Random();
            Scanner console = new Scanner(System.in);
            int returnAmount = 0;
            int guess = -1;

            int spin = rand.nextInt(37);

            System.out.print("Choose 1 to bet on low, 2 to bet on high, and 3 to bet on a specific number.");
            int choice = console.nextInt();
            console.nextLine();
            if (choice == 3){
                System.out.print("What number do you want to pick? ");
                guess = console.nextInt();
                console.nextLine();
            }
            System.out.println("The spin is "+ spin);
            if (spin == 0){
                return bet * -1;
            }
            else if (choice == 1 && spin <= 18 || choice == 2 && spin >= 19) {
                return bet * 2;

            }
            else if (spin == guess) {
                return bet * 35;
            }
            else {
                return bet * -1;
            }
        }
    }
