
/**
 * Perform Salaries
 * 
 * @author (Eshan Iyer) 
 * @version (9/9/21)
 * @period (4A)
 */

public class Salaries
{
    public static void main(String[] args)
    {
       // 1: Declaring and storing string "hi, " and "Mom" and concatenating them together
       String hi = "hi, ", mom = "Mom";
       System.out.println(hi + mom);
       
       // 2: Declaring and storing string "hi" and "Mom" and concatenating them together with other strings
       String hi2 = "hi", mom2 = "Mom";
       System.out.println(hi2+", "+ mom2+"!");
       // 3: Declaring and storing a string value Bob and printing the concatenation of it and other spacers
       String someName = "Bob";
       System.out.println("Hello, " + someName + "!");
       
       // 4: Declaring String variables hello and world, and setting them equal to "Hello" and "World"
       String hello = "Hello", world = "World";
       System.out.println(hello + ", " + world + "... Goodbye");
       
       // 6: Declaring two variables int a = 14 and int b = 6 and printing out a modulus operation with a message
       int a=14, b=6;
       int modulus = a%6;
       System.out.println(a+" % "+b+" is " + modulus);
       
       int a1 = 4;
       int b1 = 6;
       System.out.println((0 / b1) + " " + a1 * (b1 / 1.5) + "!");

    }
}
