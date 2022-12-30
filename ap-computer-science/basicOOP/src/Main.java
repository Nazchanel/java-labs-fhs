import java.util.*;

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

        System.out.println("""
                ------------------
                Do you want to change your name?
                Type 1 for Yes, 0 for no
                ------------------""");
        int nameChange = console.nextInt();

        if (nameChange == 1)
        {
            System.out.print("Enter your name >>> ");
            String temp = console.next();
            todPerson.changeName(temp);

            System.out.println();
        }

        System.out.println("Your name is " + todPerson.getName());
    }
}