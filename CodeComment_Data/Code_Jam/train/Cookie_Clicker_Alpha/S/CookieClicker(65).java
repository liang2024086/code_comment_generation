package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1198;

import java.util.*;

public class CookieClicker 
{
    public static void main(String[] args) throws Exception
    {
        Scanner in  = new Scanner(System.in);
        
        int taskNumber = in.nextInt();
        for (int task = 1; task < taskNumber + 1; task++)
        {
            double c = in.nextDouble();
            double f = in.nextDouble();
            double x = in.nextDouble();
            
            double result = 0;
            double cps = 2;
            
            while (true)
            {
                if (x/cps < c/cps + x/(cps+f))
                {
                    result += x/cps;
                    break;
                }
                else
                {
                    result += c/cps;
                    cps += f;
                }
            }
            
            System.out.printf("Case #%d: %.7f\n", task, result);
        }
    }
}
