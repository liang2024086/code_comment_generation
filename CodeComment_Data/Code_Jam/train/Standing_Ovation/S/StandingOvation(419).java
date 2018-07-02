package methodEmbedding.Standing_Ovation.S.LYD875;

import java.io.*;
import java.util.Scanner;
public class StandingOvation {
    public static void main(String args[])throws FileNotFoundException,IOException
    {
        int n,b;
        String s;
        int t,i,j,k;
        Scanner sc=new Scanner(new File("A-small-attempt0.in"));
        PrintWriter pout=new PrintWriter(new BufferedWriter(new FileWriter("op.in",false)));
        t=sc.nextInt();
        for(i=1;i<=t;i++)
        {
            int a=0,c=0;
            n=sc.nextInt();
            s=sc.next();
            for(j=0;j<s.length();j++)
            {
                b=s.charAt(j)-48;
                if(j>c)
                {
                    int temp=j-c;
                    c+=temp;
                    a+=temp;
                }
                c+=b;
            }
            pout.println("Case #"+i+": "+a);
        }
        pout.close();
    }
}
