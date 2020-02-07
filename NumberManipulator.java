/**
 * This program find the largest absolute value and then print it to the console.
 * @author Martin H. Lawton
 * @author Abdullah Almasar
 */
public class NumberManipulator
{

    /**
     * This is the main method that sends two values into the largerAbsValue method.
     * @param args
     */
    public static void main(String[] args)
	{
            double a = largerAbsValue(11,2);//Answer: 11
            double b = largerAbsValue(13,-14);//Answer: 14
            double c = largerAbsValue(0,-6);//Answer:6
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
	}

    /**
     * This method takes two parameters. first it finds the absolute values 
     * and second to find the max of the two values.
     * @param a first parameter 
     * @param x second parameter
     * @return This returns the final value back to the main method.
     */
    public static double largerAbsValue(double a, double x)
	{
            double i = Math.abs(a);
            double e = Math.abs(x);
            double answer = Math.max(i,e);
            return answer;
                
	}
        
}