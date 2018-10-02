package methodEmbedding.Cookie_Clicker_Alpha.S.LYD212;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Problem2
{
    public static void main (String [] args) throws Exception 
    {
        BufferedReader f = new BufferedReader(new FileReader("input.java"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.java")));
        StringTokenizer st = new StringTokenizer(f.readLine());
        int T=Integer.parseInt(st.nextToken());
        for(int t=0;t<T;t++) {
            st=new StringTokenizer(f.readLine());
            double C=Double.parseDouble(st.nextToken());
            double F=Double.parseDouble(st.nextToken());
            double X=Double.parseDouble(st.nextToken());
            double finishTime = X/2;
            double lastFarm = 0.0;
            int farmCount = 0;
            while(true) {
                double rate = farmCount*F + 2;
                double newTime = lastFarm + C/rate + X/(rate+F);
                if(newTime >= finishTime) break;
                farmCount++;
                lastFarm = lastFarm + C/rate;
                finishTime = newTime;
            }
            out.println("Case #"+(t+1)+": "+finishTime);
        }
        out.close();
        System.exit(0);
    }
}
