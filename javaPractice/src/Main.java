import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter your name >>> ");
        String currentName = console.nextLine();

        System.out.print("Enter your age >>> ");
        int currentAge = console.nextInt();

        System.out.println();

        Person todPerson = new Person(currentName, currentAge);

        System.out.println(currentName + " had a birthday!\n");

        todPerson.birthday();

        currentAge = todPerson.getAge();

        System.out.println(currentName + " is now " + currentAge+".\n");

        System.out.println("------------------\nDo you want to change your name?\nType 1 for Yes, 0 for no\n" +
                "------------------");
        int nameChange = console.nextInt();

        if (nameChange == 1)
        {

            todPerson.changeName();

            System.out.println();
        }

        System.out.println("Your name is " + todPerson.getName());
    }
}