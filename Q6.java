/**
 * This program determines if a point is inside a circle or not.
 * @author lawton
 */
import java.util.*;
public class Q6
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        boolean con = true;
        int x = 0;
        int inside = 0;
        int outside = 0; 
        do
        {
            try
            {
                System.out.print("number of points: ");
                x = input.nextInt();
                con = false;
            }catch(InputMismatchException e)
            {
                System.out.println("Please enter correct input.");
                input.nextLine();
            }
        }while(con);
        for(int i = 0; i <= x; i++)
        {
            double getPointX = (Math.random()*1);
            double getPointY = (Math.random()*1);
            if(where(getPointX,getPointY))
            {
                inside++;
            }
            else
            {
                outside++;
            }
        }
        System.out.print("inside: " + inside + " Outside: " + outside);
    }
    /**
     * Gets the distance from the center of the circle and checks if it is with in the circle.
     * @param x the x point.
     * @param y the y point.
     * @return returns a boolean value.
     */
    public static boolean where(double x, double y)
    {
        double d1 = Math.sqrt(Math.pow((x-0), 2) + Math.pow((y-0),2));
        return d1 <= 1;
    }
}
