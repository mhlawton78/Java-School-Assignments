/**
* A number is input in computer then a new no should get printed by adding one to
* each of its digit. If you encounter a 9, insert a 10
* (don't carry over, just shift things around).
* For example, 998 becomes 10109.
*
*
* @author Martin H. Lawton
*/
public class Challenge375
{
    public static void main(String[] args)
    {
        System.out.println(add("998"));
        System.out.println(add2(111,3));
        System.out.println(add2(999,3));
        System.out.println(add2(888,3));
    }
    public static String add(String x)
    {
        String num = "";
        for (int i = 0; i < x.length(); i++)
        {
           int temp = Character.getNumericValue(x.charAt(i))+1;
           num = num.concat(Integer.toString(temp));
        }
        return num;
    }
    public static int add2 (int x,int y)
    {
        int newNum=0;
        for(int i = 0; i < y; i++)
        {
            if(Integer.valueOf(x) == 9)
            {
                newNum = newNum*100+((x%10)+1);    
            }
            else
                newNum = newNum*10+((x%10)+1);
        }
        return newNum;
    }
}
