
/**
 * This program ask the user to enter a String value and then prints out the
 * reverse of the input.
 * @author Martin H. Lawton
 * @author Abdullah Almasar
 * 
 * Imports for the Scanner and StringBuilder needed to reverse the string and
 * ask the user for a input
 */
import java.lang.StringBuilder;
import java.util.*;

public class PrintReverse
{

    /**
     * This is the main method passes Strings into the reverse method.
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String a = "Hello There!";
        String b = "Martin Lawton";
        String c = "Abdullah Almasar";
        System.out.println(reverse(a));
        System.out.println(reverse(b));
        System.out.println(reverse(c));
        System.out.println("");
        System.out.println("Please enter a line of words you want"
                + " to be reverse: ");
        String question = input.nextLine();
        System.out.println(reverse(question));
    }

    /**
     *
     * @param i This parameter is the String that is getting passed 
     * through.
     * @return returns the reverse string back to the main method
     */
    public static String reverse(String i)
    {
        StringBuilder x = new StringBuilder(i);
        return String.valueOf(x.reverse());
       
    }
}
