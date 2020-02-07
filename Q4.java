
import java.util.*;

/**
 *   Write a program to determine all pairs of positive
 *   integers, (a, b), such that a < b < 1000 and (a^2 + b^2 + 1)/(ab) is an integer.
 * @author lawton
 */
public class Q4 
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        int n = 0;
        System.out.print("how many times: ");
        n = input.nextInt();
        finish(n);
    }
    /**
     * This is where the logic happens and see if the number is an integer. 
     * @param a Passed value from the first loop set as the X in the order pair.
     * @param b Passed value from the second loop set as the Y in the order pair.
     * @param n Number of times the loop is to happen.
     * @return  return boolean to see if the number is a integer.
     */
    public static boolean math(int a, int b,int n)
    {
       if(a < b && b < n)
       {
            double answer =  ((Math.pow(a,2) + Math.pow(b,2) + 1)/(a*b));
           return answer % 1 == 0;
        }
       return false;
    }
    /**
     * This method holds the loops needed for the program.
     * @param n number of rounds.
     */
    public static void finish(int n)
    {
        
        for(int i = 0; i <= n; i++)
        {
            for(int x = 0; x <=n; x++ )
            {
                if(math(i,x,n))
               {
                    System.out.printf("%d" + "," + "%d"+ "\n",i,x);
               }               
            }
        }
        System.out.println("Finished");
    }
}
