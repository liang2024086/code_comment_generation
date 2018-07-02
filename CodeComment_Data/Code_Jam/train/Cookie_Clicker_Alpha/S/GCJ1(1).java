package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1532;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;


public class GCJ1 {
    public static void main(String args[]) throws IOException
    {
        BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(dd.readLine());
       for(int i=1;i<=t;i++) 
       {
           double x,f,time=0.0,rate=2,time1=0.0,c;
    StringTokenizer st=new StringTokenizer(dd.readLine());
    c=Double.parseDouble(st.nextToken());
    f=Double.parseDouble(st.nextToken());
    x=Double.parseDouble(st.nextToken());
    double tmax=x/rate;
    while(true)
    {   time=time1+x/rate;
        if (time>tmax)break;
        else tmax=time;
        
        time1=time1+(c/rate);
        rate+=f;
        
     }
    System.out.println("Case #"+i+": "+new DecimalFormat("#0.0000000").format(tmax));
    
    
       }
    
    
    
    }
}
