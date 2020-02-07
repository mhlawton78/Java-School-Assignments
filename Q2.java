/**
 *   Write a program that inputs a 5-digit integer,
 *   separates the integer into its digits and prints them separated by tabs each.
 *  
 *   @author lawton
 */
import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        Boolean con = true;
        int x = 0;
        do
        {
         try
         {      
                System.out.print("Please enter 5 numbers: ");
                x = input.nextInt();
                
                con = false;
         }catch(InputMismatchException e)
            {
                System.out.println("Integer only");
                input.nextLine();
            }
        }while(con);
        tab(x);
    }
    /**
     * Method that adds tabs in between each integer.
     * @param x passed value of a 5 digit integer.
     */
    public static void tab(int x)
    {
        double y = 10000;
        for(int i = 0; i < 5; i++)
        {
            if(i == 0)
            {
                System.out.print((int)(x/y) + " "); 
            }
            else
            {
                System.out.print((int)(x/y)%10 + " ");
            }
            y = (y*0.1);
        }
    }
}
