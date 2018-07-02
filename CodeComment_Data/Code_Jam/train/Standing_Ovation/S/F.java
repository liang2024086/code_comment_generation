package methodEmbedding.Standing_Ovation.S.LYD764;

import java.io.*;
import java.util.*;

public class F
{
    public static void main(String[] args) throws Exception
    {
        Scanner in = new Scanner(System.in);
        int nData = in.nextInt();
        in.nextLine();
        
        for (int asdf = 0; asdf < nData; asdf++)
        {
            int max = in.nextInt();
            char[] nums = in.nextLine().substring(1).toCharArray();
            int currentPeople = 0;
            int needed = 0;
            
            for (int i = 0; i < max+1; i++)
            {
                int temp = i - currentPeople;
                
                if (temp > needed)
                {
                    needed = temp;
                }
                
                int peeps = nums[i] - '0';
                currentPeople += peeps;
            }
            
            System.out.println("Case #" + (asdf+1) + ": " + needed);
        }
    }
}
