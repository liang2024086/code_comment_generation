package methodEmbedding.Cookie_Clicker_Alpha.S.LYD224;

import java.io.*;
import java.util.Scanner;
class Solution
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc=new Scanner(new File("B-small-attempt1.in"));
        OutputStreamWriter out=new OutputStreamWriter(new FileOutputStream(new File("output.txt")));
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++)
        {
            double ans=0;
            int nf=0;
            double C=sc.nextDouble();
            double F=sc.nextDouble();
            double X=Double.parseDouble((sc.nextLine()).trim());
            boolean flag=true;
            while(flag)
            {
                double waitTime=(X/(2+(F*nf)));
                double nextWaitTime=(X/(2+(F*(nf+1))));
                double buyTime=(C/(2+(F*nf)));
                if(waitTime<(nextWaitTime+buyTime))
                {
                    ans=ans+waitTime;
                    flag=false;
                }
                else
                {
                    ans=ans+buyTime;
                    nf++;
                }
            }
            String output="Case #"+(i+1)+": "+ans+"\r\n";
            out.write(output);
        }
        out.close();
    }
}
