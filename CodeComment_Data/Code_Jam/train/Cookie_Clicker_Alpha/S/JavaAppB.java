package methodEmbedding.Cookie_Clicker_Alpha.S.LYD186;


import java.util.*;
import java.io.*;

class JavaAppB 
{
    public static void main(String[] args) throws IOException
    {
        File ff=new File("triali.in");
        Scanner sc=new Scanner(ff);
        FileWriter fw=new FileWriter("trialo.in");
        
        int t=sc.nextInt();
        for(int tab=1;tab<=t;tab++)
        {
            double c=sc.nextDouble();
            double f=sc.nextDouble();
            double x=sc.nextDouble();
            
            double time=x/2;
            double tempf=2.0;
            double temp_time=-1.0;
            while(true)
            {
                temp_time=time-(x/tempf)+(c/tempf)+(x/(tempf+f));
                if(temp_time>time)
                    break;
                time=temp_time;
                tempf+=f;
            }
            
                fw.write("Case #"+tab+": "+time+"\n");
        }
        fw.close();
    }
}
