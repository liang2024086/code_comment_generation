package methodEmbedding.Revenge_of_the_Pancakes.S.LYD76;

import java.util.*;
import java.io.*;

public class B
{
    public static void main(String ... orange) throws Exception
    {
        Scanner input = new Scanner(System.in);
        int numCases = input.nextInt();
        for (int n = 0; n < numCases; n++)
        {
            String S = input.next();
            S += '+';

            int ans = 0;
            for (int i = 0; i + 1 < S.length(); i++)
                if (S.charAt(i) != S.charAt(i + 1))
                    ans++;

            System.out.printf("Case #%d: ", n + 1);
            System.out.println(ans);
        }
    }
}
