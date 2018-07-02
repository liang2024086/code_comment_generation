package methodEmbedding.Cookie_Clicker_Alpha.S.LYD163;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rajarshee
 */
public class Cookie {
    public static void main(String args[])throws IOException
    {
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        int i,T=Integer.parseInt(b.readLine());
        double C,F,X,t,t1,t2,p;
        Scanner s;
        for(i=1;i<=T;i++)
        {
            t=0;p=2;
            s=new Scanner(b.readLine());
            C=s.nextDouble();
            F=s.nextDouble();
            X=s.nextDouble();
            while(true)
            {
                t1=X/p;
                t2=C/p+ X/(p+F);
                if(t1<=t2)
                {
                    t=t+t1;
                    break;
                }
                else
                {
                    t=t+C/p;
                    p=p+F;
                }
            }
            
          //  System.out.println("Case #"+i+": "+Double.valueOf(d.format(t)));
            System.out.println("Case #"+i+": "+t);
            
        }
    }
}
