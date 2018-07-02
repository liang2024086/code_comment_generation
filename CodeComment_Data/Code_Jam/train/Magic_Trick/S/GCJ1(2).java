package methodEmbedding.Magic_Trick.S.LYD663;

import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class GCJ1
{
    public static void main(String args[])throws Exception
    {
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rahul\\Desktop\\GCJ1.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\rahul\\Desktop\\GCJ1.out"));
        int t = Integer.parseInt(br.readLine());
        int ctr=0;
        while(t>0)
        {
            t--;ctr++;
            int a[] = new int[17];
            int i,k,j;
            int m = Integer.parseInt(br.readLine());
            for(i=1;i<m;i++)
            {
                br.readLine();
            }
            st=new StringTokenizer(br.readLine());
            for(j=0;j<4;j++)
            {
                a[Integer.parseInt(st.nextToken())]++;
            }
            
            for(i=m+1;i<=4;i++)
                br.readLine();
            
            int ans=-1, times=0;
            
            m = Integer.parseInt(br.readLine());
            for(i=1;i<m;i++)
            {
                br.readLine();
            }
            st=new StringTokenizer(br.readLine());
            for(j=0;j<4;j++)
            {
                k=Integer.parseInt(st.nextToken());
                a[k]++;
                if(a[k]==2)
                {
                    ans = k;
                    times++;
                }
            }
            
            for(i=m+1;i<=4;i++)
                br.readLine();
            
           pw.print("Case #"+ctr+": "); 
           if(times == 0)
               pw.println("Volunteer cheated!");
           else if(times==1)
               pw.println(ans);
           else
               pw.println("Bad magician!");
        }
        pw.flush();
        br.close();
        pw.close();
    }
}
