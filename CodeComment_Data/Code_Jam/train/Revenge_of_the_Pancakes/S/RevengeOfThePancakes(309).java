package methodEmbedding.Revenge_of_the_Pancakes.S.LYD389;

import java.util.*;
public class RevengeOfThePancakes
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        for (int i = 0; i < T; i++)
        {
            String s = input.next();
            char[] c = s.toCharArray();
            int count = 0;
            char curr = 'a';
            for (int j = 0; j < c.length; j++)
            {
                if (curr != s.charAt(j))
                {
                    count++;
                    curr = s.charAt(j);
                }
            }
            if (curr == '+')
            {
                count--;
            }
            System.out.println("Case #" + (i+1) + ": " + count);
        }

    }

}
