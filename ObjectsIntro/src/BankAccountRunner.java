import java.util.Scanner;

public class BankAccountRunner {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BankAccount one = new BankAccount("Eshan", 1231.0);
        BankAccount two = new BankAccount("Alfredo", 1299.0);
        BankAccount three = new BankAccount("Zach", 3121.0);

        if (one.getBalance() >= two.getBalance() && one.getBalance() >= three.getBalance())
        {
            System.out.println(one.getOwner() + " has the highest amount.");
        }
        else if (two.getBalance() >= three.getBalance())
        {
            System.out.println(two.getOwner() + " has the highest amount.");
        }
        else
        {
            System.out.println(three.getOwner() + " has the highest amount.");
        }
        System.out.println();

        System.out.print("Enter your withdraw amount >>> ");
        double withdrawAmount = console.nextDouble();
        console.nextLine();

        one.withdraw(withdrawAmount);

        System.out.println("Your current balance is " + one.getBalance() + ".");

        double balance;
        String owner;

        System.out.print("Enter your name >>> ");
        owner = console.nextLine();

        System.out.print("Enter your balance >>> ");
        balance = console.nextDouble();

        BankAccount bankAccount = new BankAccount(owner, balance);

        System.out.println("Hi " + bankAccount.getOwner() + ". Your account balance is $" + bankAccount.getBalance());




    }
}
