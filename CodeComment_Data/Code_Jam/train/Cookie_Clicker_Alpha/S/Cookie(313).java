package methodEmbedding.Cookie_Clicker_Alpha.S.LYD951;

import java.util.Scanner;

/**
 * Created by ge3k on 12/4/14.
 */
public class Cookie {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int a = 1; a <= t; ++a)
        {
            double c = scan.nextDouble(); //farm cost
            double f = scan.nextDouble(); //CPS differential of 1 farm
            double x = scan.nextDouble(); //get x to win
            double ans = 0;
            double currentRate = 2;
            while(true)
            {
                double oldVar = x/currentRate;
                double nItems = c/currentRate + x/(currentRate + f);
                if(oldVar < nItems)
                {
                    ans += oldVar;
                    break;
                }
                else
                {
                    ans += c/currentRate;
                    currentRate += f;
                }
            }
            System.out.println("Case #" + a + ": " + ans);
        }
    }
}

