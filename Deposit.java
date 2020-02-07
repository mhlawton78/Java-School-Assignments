/**
 *  I have abided by the UNCG Academic Integrity Policy on this assignment.
 *  @author Martin H. Lawton
 *  @author Kevin  J. Doheny
 *  10/25/2017
 *  This program calculates the amount of money needed to be put into a bank
 *  account to find the end amount based on the interest rate.
 */
import java.util.*;
public class Deposit
{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        displayBanner();
        double fValue = getFutureValue();
        double iRate = getInterestRate();
        int numYear = getNumberOfYears();
        double pValue = presentValue(fValue,iRate,numYear);
        double x = iRate * 100;
        System.out.printf("To achieve $%,.2f in %d year(s) at an interest rate of"
                + " %.2f%%, a deposit of $%,.2f is required.\n" ,fValue, numYear, x, pValue);
    }
    /**
     * This method welcomes the user.
     */
    public static void displayBanner()
    {
        System.out.println("Welcome to Interest Calculator!");
    }
    /**
     * this method gets the user input for the total amount the user wants.
     * @return returns a double.
     */
    public static double getFutureValue()
    {
        double x = 0;
        do
        {
            try
            {
                System.out.print("Input the amount you want to accumulate: ");
                x = input.nextDouble();
                if(x < 0)
                {
                    System.out.println("Enter a positive number.");
                }
            }catch(InputMismatchException e)
            {
                System.out.println("Please enter correct input.");
                input.nextLine();
            }                
        }while(x <= 0 );
        return x;
    }
    /**
     * Gets the interest rate of which the user inputs.
     * @return returns a double.
     */
    public static double getInterestRate()
    {
        double x = 0.0;
        do
        {
            try
            {
                System.out.print("Input the Interest Rate: ");
                x = input.nextDouble();
                if(x <= 0 || x >= 1)
                {
                    System.out.println("Pleae enter correct Interest Rate.");
                }
            }catch(InputMismatchException e)
            {
                System.out.println("Please enter correct input.");
                input.nextLine();
            }

        }while(x <= 0 || x >= 1 );        
        return x;
    }
    /**
     * Prompts user to input a number of years to gather interest on
     * @return returns a integer
     */
    public static int getNumberOfYears()
    {
        int x = 0;
        do
        {
            try
            {
                System.out.print("Input the amount of years: ");
                x = input.nextInt();
                if(x < 0)
                {
                    System.out.println("Enter a positive number.");
                }
            }catch(InputMismatchException e)
            {
                System.out.println("Please enter correct input.");
                input.nextLine();
            }
        }while(x <= 0 );        
        return x;
    }
    /**
     * Calculates the money needed now for deposit.
     * @param x FutureValue
     * @param y InterestRate
     * @param z NumberOfYears
     * @return returns a double
     */
    public static double presentValue(double x, double y, int z)
    {
        return x / Math.pow((1+y), z);
    }
}
