package methodEmbedding.Cookie_Clicker_Alpha.S.LYD397;

import java.io.*;
import java.util.*;
import java.math.*;
    
public class CookieClickerAlpha {
    public static void main(String [] args) throws IOException {
        BufferedReader f = new BufferedReader (new FileReader("P:/codejam/final/cookie/B-small-attempt1.in"));
        PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter("P:/codejam/final/cookie/testfinal.out")));
        int T = Integer.parseInt(f.readLine());
        for(int i=0; i<T; i++)
        {
            StringTokenizer s = new StringTokenizer(f.readLine());
            double C = Double.parseDouble(s.nextToken());
            double F = Double.parseDouble(s.nextToken());
            double X = Double.parseDouble(s.nextToken());
            double temp = 2;
            double newtime=0,oldtime=1,time=0;
            while(1==1)
            {
                oldtime = X/temp;
                newtime = (C/temp)+(X/(temp+F));
                if(oldtime>newtime)
                {
                    time+=(C/temp);
                    temp+=F;
                }
                else
                {
                    time+=oldtime;
                    break;
                }
            }            
            double output = (double)Math.round(time*10000000)/10000000;
            out.println("Case #"+(i+1)+": "+output);
        }
        out.close();
        System.exit(0);
}
}
