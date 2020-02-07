/**
 * We have abided by the UNCG Academic Integrity Policy on this assignment.
 * This program runs Craps 10000 times and then displays the results.
 * @author Martin H. Lawton
 * @author Kevin J. Doheny
 */
import java.util.Random;
public class Craps
{
    /**
     * This is a final that makes the game run 10000
     */
    final static int ROUND = 10000;
    public static void main(String[] args)
    {
        //create random 2 numbers each between 1 and 6. 
        //This creates a random object.
        Random rand = new Random();
        int d1 = 0;
        int d2 = 0;
        int total = 0;
        int win = 0;
        int lose = 0;
        double prob = 0.0;
        // determine outcome from the rules on canvas.
        for(int i = 1; i <= ROUND; i++)
        {
            d1 = rand.nextInt(6) + 1;
            d2 = rand.nextInt(6) + 1;
            total = d1 + d2;
            // switch determine the come out roll
            switch(total)
            {
                case 2:
                case 3:
                case 12:
                    lose++;
                    System.out.println("You rolled craps: " + total + "." +" You lose.");
                    break;
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                    int point = total;
                    int x = 0;
                    System.out.print("Your point is: " + total +" Continue rolling... ");
                    do
                    {
                    d1 = rand.nextInt(6) + 1;
                    d2 = rand.nextInt(6) + 1;
                    total = d1 + d2;                        
                        if(point == total)
                        {
                            System.out.println(total + " You hit the point. You win!");
                            win++;
                            x++;
                        }
                        else if(total == 7)
                        {
                            System.out.println("7 You rolled 7. You lose.");
                            lose++;
                            x++;
                        }
                        else
                        {
                            System.out.print(total + " ");
                        }
                    }while(x < 1);
                    break;
                case 7:
                case 11:
                    win++;
                    System.out.println("You rolled a natural: " + total + ". You win!" );  
                    break;
            }
        }
        //figure out the probability
        prob = ((double)win / ROUND) * 100;
        // display outcome.
        System.out.println("FINAL RESULTS");
        System.out.println("-------------");
        System.out.println("Wins: " + win);
        System.out.print("Losses: " + lose + "\n");
        System.out.printf("The probability of winning at craps is: %.2f%%\n" , prob);

    }
}
