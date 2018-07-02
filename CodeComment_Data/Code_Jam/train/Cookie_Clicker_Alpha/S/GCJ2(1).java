package methodEmbedding.Cookie_Clicker_Alpha.S.LYD284;

import java.io.*;
import java.util.*;
import java.lang.Math.*;
public class GCJ2
{
    public static void main(String args[])throws Exception
    {
        //Scanner in=new Scanner(System.in);
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\rahul\\Desktop\\GCJ2.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("C:\\Users\\rahul\\Desktop\\GCJ2.out"));
        int t= Integer.parseInt(br.readLine());
        int ctr=0;
        while(t>0)
        {
            t--;
            ctr++;
            st=new StringTokenizer(br.readLine());
            double c = Double.parseDouble(st.nextToken());
            double f = Double.parseDouble(st.nextToken());
            double x = Double.parseDouble(st.nextToken());
            double time = 0.0, cookie = 0.0;
            double recovery_time = c/f;
            double cookie_rate = 2.0;
            if(c>=x)
                time = x/2;
            else
            {
                time += c/cookie_rate;
                cookie = c;
                
                while(cookie == c)
                {
                    if(recovery_time*(cookie_rate+f) <= x)
                    {
                        cookie_rate += f;
                        cookie = 0;
                    }
                    else
                    {
                        time += (x-cookie)/cookie_rate;
                        break;
                    }
                    cookie = c;
                    time += c/cookie_rate;
                }
                
            }
          pw.println("Case #"+ctr+": "+time);  
        }
        pw.flush();
        br.close();
        pw.close();
    }
}
