package methodEmbedding.Standing_Ovation.S.LYD827;

import java.util.Scanner;
import java.util.Arrays;

public class StandingOvation
{   
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int tests; // number of tests and answers
        tests = Integer.parseInt(s);
        
        
        for (int i = 0; i < tests; i++)
        {
            int count = 0;
            int stoodup = 0;
            s = sc.nextLine();
            String[] numbers = s.split(" ");
            int Smax = Integer.parseInt(numbers[0]);
            String sequence = numbers[1];
           
            for (int j = 1; j < Smax + 1; j++)
            {
                stoodup += (int)(sequence.charAt(j - 1)) - 48;

                if ((int)(sequence.charAt(j)) == 48)
                    continue;
                
                if (stoodup < j)
                {
                    count += j - stoodup;
                    stoodup += count;
                }
            }
            
            System.out.println("Case #" + (i + 1) + ": " + count);
        }
        
    }
}
