package methodEmbedding.Revenge_of_the_Pancakes.S.LYD478;

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
            String s = input.next();

            int result = 0;
            char last = '\0';
            for (int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);
                if (i==0 && c=='-')
                    result++;
                else
                    if (i>0 && c!=last && last=='+')
                        result ++;
                if (s.length()>(i+1) && c=='+' && s.charAt(i+1)=='-')
                    result++;
                last = c;
            }
            System.out.printf("Case #%d: %d\n", n + 1, result);
        }
    }
}
