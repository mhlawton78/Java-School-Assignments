import java.util.*;
/**
 * This program makes up a number and asks the user to guess the number
 * @author Martin H. Lawton
 * @author Abdulllah Almasar
 */
public class RandomLetter
{

    /**
     * asks the user for a number three different times and see if the number
     * is the random number.
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int count = 3;
        int ran = random();
        boolean continueTest = true;
        do
        {    
            do
            {
                try
                {
                    System.out.print("number: ");
                    int a = input.nextInt();
                    if(a == ran)
                    {
                        System.out.println("Correct");
                        break;
                    }
                    else if(a != ran)
                    {
                        if(a > ran)
                        {
                            System.out.println("Sorry not correct"); 
                            System.out.println("your number is higher then random number");

                        }
                        if(a < ran)
                        {
                            System.out.println("Sorry not correct"); 
                            System.out.println("Your number is lower then random number");
                        }

                        count--;
                    }
                }
                catch(InputMismatchException ex)
                {
                    System.out.println("Please enter correct number");
                    input.nextLine();
                }

            }while(count > 0);
            continueTest = restart();

        }while(continueTest == true);

    }

    /**
     * asks the user if they want to play again.
     * @return returns a boolean answer 
     */
    public static boolean restart()
    {
        Scanner input = new Scanner(System.in);
        int question = 0;
        boolean answer = false;
        boolean continueTest = true;
        do
        {
            try
                {
                    System.out.println("do you want to continue (1: yes 2: no): ");
                    question = input.nextInt();
                    if(question == 1)
                    {
                       answer = true;
                       continueTest = false;
                    }
                    else if(question == 2)
                    {
                        answer = false;
                        continueTest = false;
                    }
                }
                catch(InputMismatchException ex)
                {
                    System.out.println("Please enter correct input");
                    input.nextLine();
                }
        }while(continueTest == true);
      return answer;   
    }

    /**
     * creates a random number for the user to guess.
     * @return returns the number that needs to be guessed.
     */
    public static int random()
    {
        Random seed = new Random(System.currentTimeMillis());
        Random ran = new Random(seed.nextInt());
        int random = 1 + ran.nextInt(50);
        return random;
    }
}
