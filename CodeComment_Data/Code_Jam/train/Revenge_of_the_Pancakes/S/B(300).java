package methodEmbedding.Revenge_of_the_Pancakes.S.LYD433;

import java.util.Scanner;

public class B
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++)
        {
            String S = sc.next();

            char curCh = S.charAt(0);
            String newS = String.valueOf(curCh);

            for(int j = 1; j < S.length(); j++)
            {
                if(S.charAt(j) != curCh)
                {
                    curCh = S.charAt(j);
                    newS += String.valueOf(curCh);
                }
            }

            if(newS.endsWith("+")) newS = newS.substring(0, newS.length()-1);

            System.out.println("Case #"+(i+1)+": "+newS.length());
        }
    }
}
