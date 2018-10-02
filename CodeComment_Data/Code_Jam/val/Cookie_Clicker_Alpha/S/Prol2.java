package methodEmbedding.Cookie_Clicker_Alpha.S.LYD424;

import java.util.*;
import java.io.*;
class Prol2
 {
      public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(new FileReader("B-small-attempt0.in"));
        PrintWriter pw = new PrintWriter("output.out");
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
         double c=sc.nextDouble(),f=sc.nextDouble(),x=sc.nextDouble() ,total, r=2;
         double time;
         time= 0;
         total=0;
         if(x<=c)
         pw.println("Case #"+i+": "+(x/r));
         else
         {
             while(total<x)
             {
                 total=total+c;
             if(((x-total)/r) <(x/(r+f)))
             {
                 time=time+((x-total)/r)+(c/r);
                 break;
                }
                else
                {
                    time=time+(c/r);
                    r=r+f;
                    total=0.0;
                }
            }
            pw.println("Case #"+i+": "+time);
        }

    }
    pw.close();
}
}
         
