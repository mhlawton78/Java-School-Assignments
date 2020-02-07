/**
 * This program sends values into the printPolynomialSolution and then calculates 
 * the value sent to the printPolynomialSolution Method.
 * @author Martin H. Lawton
 * @author Abdullah Almasar
 */
public class Polynomial
{

    /**
     * Main method that is calling the printPolynomialSolution method.
     * @param args
     */
    public static void main(String[] args)
    {
        printPolynomialSolution(15); 
        printPolynomialSolution(3);
        printPolynomialSolution(7);
    }

    /**
     * This method calculates the answer with the given value from the main
     * method.
     * @param x This parameter is the value that is getting passed.
     */
    public static void printPolynomialSolution(int x)
    {
        double answer = (12.3*Math.pow(x,4))-(9.1*Math.pow(x,3))+(19.3*Math.pow(x,2))-(4.6*x)+34.2;
        System.out.println("This answer is: " + answer);
    }
}
