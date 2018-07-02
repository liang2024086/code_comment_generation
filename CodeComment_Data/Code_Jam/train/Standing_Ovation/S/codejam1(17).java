package methodEmbedding.Standing_Ovation.S.LYD1513;

import java.io.*;
import java.util.*;
class codejam1
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new FileReader("/home/sonu/Downloads/A-small-attempt1.in"));
        PrintWriter out=new PrintWriter("output.txt", "UTF-8");
        int t=Integer.parseInt(in.readLine());
        for(int t1=0;t1<t;t1++){
            long no=0,ans=0;
            String[] s=in.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int[] a=new int[n+1];
            for(int i=0;i<(n+1);i++)
                a[i]=Integer.parseInt(s[1].charAt(i)+"");
            /*if(a[0]==0)
                {ans+=1;a[0]=1;}*/
            for(int i=1;i<=(n+1);i++){
                no+=a[i-1];
                if(no<i)
                    {ans+=(i-no);no+=(i-no);}
            }
            out.println("Case #"+(t1+1)+": "+ans);
        }
        out.close();
    }
}
