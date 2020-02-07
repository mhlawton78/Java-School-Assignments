/**
 * This program asks the user figures out there phone bill. The output tells the
 * user how much they owe to there greedy service carrier.
 * @author Martin H. Lawton
 */
import java.util.Random;
import java.util.Scanner;

public class CellularBilling
{
    /**
     * Constant for the FCC fee.
     */
    final static double FCC_FEE = 2.75;
    /**
     * Starts the program creates two objects a scanner and a Random object.
     * @param args array of letters.
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        start(input,ran);
    }
    /**
     * Start method figures out the input and output.
     * @param a passed scanner object
     * @param b passed random object.
     */
    public static void start(Scanner a,Random b)
    {
        int num1 = b.nextInt(100)*10;
        int num2 = b.nextInt(100)*10;
        int num3 = b.nextInt(1000)*4;   
        int overMin = 0;  
        int outDiscount = 0; 
        double planCost = 0;
        double discount = 0;
        double total = 0;
        double overPrice = 0.0;
        double temp = 0.0;
        double finalCost = 0.0; 
        Boolean member = false;

            System.out.println("Welcome to your your cellphone plan! We love "
                + "to take your money!"+"\n");//Oh yes they do.
            System.out.println("The phone number given is: (" + num1 +")"
                + num2 + "-" + num3 + "\n");

            System.out.println("Choose your phone plan");
            System.out.println("(Plan 1): 1 (Plan 2): 2 (Plan 3): 3 (Plan 4): 4");

            System.out.print("Enter plan: ");
            int plan = a.nextInt();
            System.out.print("How many minutes did you use this month?: ");
            int min = a.nextInt();
            System.out.print("How old are you?: ");
            int age = a.nextInt();
            System.out.print("Are you  a preferred member?(true or false): ");
            member = a.nextBoolean();


        switch (plan) {
            case 1:
                planCost = 75.00;
                if(min > 250)
                {
                    overMin = min - 250;
                    overPrice = overMin * 0.25;
                }
                else
                {
                    overMin = 0;
                }
                break;
            case 2:
                planCost = 100.00;
                if(min > 500)
                {
                    overMin = min - 500;
                    overPrice = overMin * 0.15; 
                }
                else
                {
                    overMin = 0;
                }
                break;
            case 3:
                planCost = 125.00;
                if(min > 750)
                {
                    overMin = min - 750;
                    overPrice = overMin * 0.10;      
                }
                else
                {
                    overMin = 0; 
                }
                break;
            case 4:
                planCost = 150.00;
                overMin = 0;
                break;
            default:
                break; 
        }
        if(age > 25 || age < 50)
        {
            discount = 0.0;
        }        
        else if(age <= 25 && member == true)
        {
            discount = 0.10;
        }
        else if(age <= 25 && member == false)
        {
            discount = 0.05;
        }     
        else if(age >= 50 || age <= 62  && member == true)
        {
            discount = 0.20;
        }
        else if(age >= 50 || age <= 62  && member == false)
        {
            discount = 0.15;
        }  
        else if(age >= 63 && member == true)
        {
            discount = 0.30;
        }
        else if(age >= 63 && member == false)
        {
            discount = 0.25;
        }

        temp = discount * 100;
        outDiscount = (int)temp;
        total = planCost + overPrice * discount;
        finalCost = total + FCC_FEE;
        
        System.out.println("");
        System.out.println("Your number is: (" + num1 + ")" + num2 + "-" + num3 );
        System.out.println("Your plan is: " + plan);
        System.out.println("Total number of minutes used" + min);
        System.out.println("You went over " + overMin + " minutes");
        System.out.println("Your age: " + age);
        System.out.println("member status: " + member);
        System.out.println("Your discount is: " + outDiscount + "%");
        System.out.println("your total for this month is: $" + finalCost);
        

    }
}
