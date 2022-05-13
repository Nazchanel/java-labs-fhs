import java.util.*;
public class Runner {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter your name >>> ");
        String name = console.nextLine();

        System.out.print("Enter your wallet amount >>> ");
        double wallet = console.nextDouble();
        console.nextLine();

       Casino casino = new Casino(name, wallet);
       casino.play();
    }
}
