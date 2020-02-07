/**
 * Convert Celsius to Fahrenheit
 * Fahrenheit = (9/5) * Celsius + 32
 * Celsius = (Fahrenheit - 32) * (5/9)
 * @author Martin H. Lawton
 */

import java.util.Scanner;

public class Temp_Convert
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String choice;
        double temp;
        
        System.out.println("Celsius: c Fahrenheit: f");
        System.out.print("Please enter c or f: ");
        choice = input.next().toLowerCase();
        
        if("c".equals(choice))
        {
            System.out.println("Please enter degree: ");
            temp = input.nextDouble();
            celsius(temp);
        }
        else if("f".equals(choice))
        {
            System.out.println("Please enter degree: ");
            temp = input.nextDouble();
            fahrenheit(temp);            
        }
    }
    //Convert to Celsius
    public static void celsius(double x)
    {
        System.out.println((x - 32)*(5/9));
    }
    //Convert to Fahrenheit
    public static void fahrenheit(double x)
    {
        System.out.println((9/5) * x + 32);
    }
}
