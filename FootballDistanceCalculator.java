/**
 * In this program we calculate how far a football is thrown from one point.
 * @author Martin H. Lawton
 */
public class FootballDistanceCalculator
{
    /**
     * This is where we set the class constant variable. 
     */
    /**
     * This Variable sets amount of gravitational pull on the football.
     */
    public static final double GRAVITATIONAL_ACCELERATION = 32.174;  //feet per sec^2
    /**
     * This Variable sets at what angle the ball is first thrown.
     */
    public static final int MIN_ANGLE = 10; //degrees
    /**
     * This Variable set the max angle that the ball gets to before
     * the gravitational pull brings the ball back down.
     */
    public static final int MAX_ANGLE = 90; //degrees
    /**
     * This Variable changes the angle at which the ball is thrown over time.
     */
    public static final int ANGLE_INCREMENT = 10;
    /**
     * This Variable sets the speed at which the ball has been thrown.
     */
    public static final double VELOCITY = 30; //miles/hour
    /**
     * This Variable sets the hight at which the ball starts its travel.
     */
    public static final double HEIGHT = 5; //feet
    /**
     * This Variable changes the Velocity variable from Miles per hour
     * to Feet per second.
     */
    public static final double feet = ((VELOCITY / 60) * 5280)/60;
    /**
    *    This is the main method. In this method we use a for loop to get the answer
    *    that is being returned from the calculateDistance method.
    *
    * @param args
    */

    public static void main(String[] args)
    {
        System.out.println("Angle(Degrees)              Distance(Feet)");
        for(int num = MIN_ANGLE; num <= MAX_ANGLE; num = num + ANGLE_INCREMENT)
        {
           double answer = calculateDistance(num,feet,HEIGHT);
           System.out.println(num + "                          "+answer);
        }
    }
/**
 * Calculates the distance a projectile travels
 * 
 * @param angle angle at which projectile is thrown in degrees.
 * @param velocity initial velocity of projectile in miles/hour.
 * @param height initial height of projectile in feet.
 * @return distance traveled by projectile in feet.
 */ 
    public static double calculateDistance(double angle, double velocity, double height)
    {
        double gravity = GRAVITATIONAL_ACCELERATION;
        double rAngle = Math.toRadians(angle);
        double answer = 0;
        double question = 0, question2 = 0;
        
        question = (feet*(Math.cos(rAngle))/gravity);
        question2 = (feet*Math.sin(rAngle)+Math.sqrt(Math.pow(feet*(Math.sin(rAngle)),2.0)+(2 * gravity * height)));
        answer = question * question2;
        
        return answer;
    } 
}
