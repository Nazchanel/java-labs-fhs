public class dsa
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        System.out.println(“Enter an integer (1 - 20) >> “);
        int num = console.nextInt();

        // user enters 17

        System.out.println(“Enter your name: “);
        String name = console.nextLine();

        // user enters “John Smith”

        if (num > 4)
        {
            System.out.println(“Your name is: “ + name);
        }
        else
        {
            System.out.println(“My name is: “ + name);
        }

    }
}