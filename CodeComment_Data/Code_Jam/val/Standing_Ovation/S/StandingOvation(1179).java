package methodEmbedding.Standing_Ovation.S.LYD166;

import java.io.*;
import java.util.*;

public class StandingOvation
{
    public static void main(String args[])throws IOException
    {
        File f = new File("SO_s(1).in");
        Scanner sc = new Scanner(f);
        PrintWriter pw = new PrintWriter(new FileWriter("SO_s.out"));
        int T=sc.nextInt();
        for(int i=1;i<=T;i++)
        {
            int N=sc.nextInt();
            String s=sc.next();
            char c[]=s.toCharArray();
            int sum=(int)c[0]-'0',count=0;
            for(int j=1;j<=N;j++)
            {
                //System.out.println(sum+" "+count+" "+j);                
                if(sum<j)
                {
                    count+=(j-sum);
                    sum=j;
                }
                sum+=(int)c[j]-'0';
            }
            //System.out.println("Case #"+i+": "+count);
            pw.println("Case #"+i+": "+count);
        }
        pw.close();
    }
}
