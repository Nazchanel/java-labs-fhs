import java.util.*;
public class Person {

    Scanner console = new Scanner(System.in);
    private String name;
    private int age;

    public Person(String n, int a)
    {
        name = n;
        age = a;
    }
    public void birthday()
    {
        age++;

    }
    public void changeName(String n)
    {
        name = n;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }

}
