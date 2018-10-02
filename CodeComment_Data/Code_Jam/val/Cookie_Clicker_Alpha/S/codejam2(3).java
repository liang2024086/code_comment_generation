package methodEmbedding.Cookie_Clicker_Alpha.S.LYD233;


import java.io.*;
import java.util.Scanner;

public class cookie {
   
   public static void main(String[]args)throws IOException
   {
       Scanner s=new Scanner(new File("E://B-small-attempt0.in"));
       int t=s.nextInt();
       int m=t;
       double c , f , x , rate , time , t1 , t2;
       while(t-->0)
       {
           c=s.nextDouble();
           f=s.nextDouble();
           x=s.nextDouble();
           rate=2.0;
           
           time=0.0;
           t1=0.0;
           t2=Math.round((x/2) * 10000000.0) / 10000000.0;
           while(true)
           {
               t1 = time + (c/rate) +(x/(rate+f));
               t1 = Math.round(t1 * 10000000.0) / 10000000.0;
               if(t1 > t2)
               break;
               t2 = t1;
               time = time + c/rate;
               time= Math.round(time * 10000000.0) / 10000000.0;
               rate= rate+f;
               rate= Math.round(rate * 10000000.0) / 10000000.0;
           }
           System.out.printf("case #%d: %.7f\n",m-t,t2);   
       }
   }
}

