/**
 * I have abided by the UNCG Academic Integrity Policy on this assignment.
 * Program test 2 
 * This program does the quadratic equation.
 * @author Martin H. Lawton
 * 11/1/2017
 */
//import for scanner
import java.util.Scanner;
public class QuadraticRoots
{
    //scanner object
    static Scanner x = new Scanner(System.in);
    public static void main(String[] args)
    {
        //methods being called and stored.
        displayBanner();
        int a = getCoefficient('a');
        int b = getCoefficient('b');
        int c = getCoefficient('c'); 
        double root1 = getRoot(a, b, c, 1);
        double root2 = getRoot(a, b, c, 2); 
        displayRoots(a,b,c, root1, root2);
    }
    /**
     * This method displays the banner.
     */
    public static void displayBanner()
    {
        System.out.println("Welcome to the Quadratic Calculator");
    }
    /**
     * This method gets the user input and returns the coefficient.
     * @param c char value
     * @return returns the coefficient.
     */
    public static int getCoefficient(char c)
    {
        int y;
        if(c == 'a')
        {
            do
            {
                System.out.printf("Enter the coefficient %s: ",c);
                y = x.nextInt();
                if(y == 0)
                {
                    System.out.println("No roots for the expression");
                    System.out.println("");
                    x.nextLine();
                }
            }while(y == 0);
        }
        else
        {
            System.out.print("Enter the coefficient a: ");
            y = x.nextInt();
        }
        return y;
    }
    /**
     * This method gets the discriminant.
     * @param x first (a) integer 
     * @param y second (b) integer
     * @param b third (c) integer
     * @return returns a double.
     */
    public static double getDiscriminant(int x, int y, int b)
    {
        return Math.pow(y, 2) - 4*(x*b);                
    }
    /**
     * This method gets the square root.
     * @param x first (a) integer 
     * @param y second (b) integer
     * @param z third (c) integer
     * @param u input for which problem to use.
     * @return  returns a double.
     */
    public static double getRoot(int x, int y, int z,int u)
    {
        //root1
        if(u == 1)
        {
            return (-y + Math.sqrt(getDiscriminant(x, y, z))) / (2*x);
        }
        //root2
        else if(u == 2)
        {
            return (-y - Math.sqrt(getDiscriminant(x, y, z))) / (2*x); 
        }
        return 0.0;
    }
    /**
     * displays the output.
     * @param x first (a) integer 
     * @param y second (b) integer
     * @param b third (c) integer
     * @param z first root
     * @param c second root
     */
    public static void displayRoots(int x, int y, int b, double z,double c)
    {
        System.out.printf("The quadratic equation %dx^2 + %dx + %d = 0"
                + " has roots of %.5f and %.5f \n",x,y,b,getRoot(x, y, b, 1),getRoot(x, y, b, 2));
    }
}
