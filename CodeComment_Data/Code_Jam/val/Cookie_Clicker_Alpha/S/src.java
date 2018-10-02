package methodEmbedding.Cookie_Clicker_Alpha.S.LYD31;

import java.util.Scanner;


public class Prob2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        double c=0,f=0,x=0,speed=2,tt=0,t1=0,t2=0;
        
        for(int k=1;k<=t;k++)
        {
            tt=0;
            speed=2;
            c=sc.nextDouble();
            f=sc.nextDouble();
            x=sc.nextDouble();
            
            while(true)
            {
                t1=x/speed;
                t2=(c/speed)+(x/(speed+f));
                if(t1>t2)
                {
                    tt+=(c/speed);
                    speed+=f;
                }
                else
                {
                    tt+=t1;
                    break;
                }
            }
            
            tt=(double)Math.round(tt * 10000000) / 10000000;

            System.out.println("Case #"+k+": "+tt);       
        }
    }
}
