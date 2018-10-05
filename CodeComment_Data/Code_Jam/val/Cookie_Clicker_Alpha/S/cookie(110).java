package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1041;

import java.io.*;
import java.util.*;

class cookie
{
    public static void main(String[] ar)throws Exception
    {
        Scanner sc = new Scanner(new File("in.txt"));
        PrintWriter pw = new PrintWriter(new File("out.txt"));
        int t = sc.nextInt();
        for(int i = 1; i <= t; i++)
        {
            double c = sc.nextDouble();
            double f = sc.nextDouble();
            double x = sc.nextDouble();
            double time = 0;
            double rate = 2;
            while(true)
            {
                double t1 = c/rate;
                double t2 = x/(rate + f);
                if(t1+t2 < x/rate)
                {
                    time+=c/rate;
                    rate+=f;
                }
                else
                {
                    time += x/rate;
                    break;
                }
            }
            pw.println("Case #" + i + ": " + time);
       }
       pw.close();
       sc.close();
   }
}

