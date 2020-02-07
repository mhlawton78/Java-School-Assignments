/**
 *  This program prints out ASCII art.
 * @author Martin H. Lawton
 */
public class Art
{
    /**
     * This is the main method. This method calls the 2 other methods to print
     * the fish.
     * @param args 
     */
    public static void main(String[] args)
    {
        /**
         * This calls the method that prints out the top half.
         */
        top_Half();
        /**
         * This calls the method that prints out the bottom half
         */
        bottom_Half();
        
    }
    /**
     * This method hold the print statements for the top half of the fish.
     */
    public static void top_Half()
    {
        System.out.println("    ______");
        System.out.println("   `\"\"-.  `````-----.....__");
        System.out.println("        `.  .      .       `-.");
        System.out.println("          :     .     .       `.");
        System.out.println("    ,     :   .    .          _ :");
        System.out.println("   : `.   :                  (@) `._");
        System.out.println("    `. `..'     .     =`-.       .__}");        
    }
    /**
     * This method hold the print statements for the bottom half of the fish.
     */    
    public static void bottom_Half()
    {
        System.out.println("      ;     .        =  ~  :     .-\"");
        System.out.println("    .' .'`.   .    .  =.-'  `._ .'");
        System.out.println("   : .'   :               .   .'");
        System.out.println("    '   .'  .    .     .   .-'");
        System.out.println("      .'____....----''.'=.'");
        System.out.println("      \"\"             .'.'");
        System.out.println("                  ''\"'` ");        
    }
}
