package methodEmbedding.Cookie_Clicker_Alpha.S.LYD447;

import java.util.*;
public class Cookie
{
  public static void main(String args[])
  {
     Scanner in=new Scanner(System.in);
     int num; double C; double F; double X;
     num=in.nextInt();
     for(int i=0; i<num;i++)
     {
        C=in.nextFloat();
        F=in.nextFloat();
	X=in.nextFloat();
	int flag=0; double rate=2.000000000; double total=0.0;
	while(flag!=1)
        {
           double t1=(C/rate)+(X/(rate+F));
           double t2=X/rate;
           if(t1<t2)
           {
              total+=(C/rate);
              rate=rate+F;
            }
            else
            {
               total+=(X/rate);
               flag=1;
             }
         }
         System.out.println("Case #"+(i+1)+": "+total);
      }
    }
}
           
