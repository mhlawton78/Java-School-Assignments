/**
 * 
 * @author lawton
 * write a program to evaluate the value of the following real valued function 
 * f(x,y,z) = x^3+y^3+z^4+(x+y)^4*z
 */
import java.util.*;
public class Q1 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean con = true;
        double x = 0;
        double y = 0;
        double z = 0;
        do
        {
                try
                {
                    System.out.print("Please enter three integer value: ");
                    x = input.nextDouble();
                    y = input.nextDouble();
                    z = input.nextDouble();
                    con = false;
                }catch(InputMismatchException e)
                {
                    System.out.println("Integer only");
                    input.nextLine();
                }
        }while(con);
        System.out.println(math(x,y,z));
        
    }
    public static double math(double x,double y,double z)
    {
        return (Math.pow(x, 3) + Math.pow(y, 3) + 
                Math.pow(z, 4) + Math.pow((x+y),4) * z);
    }
}
