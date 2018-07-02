package methodEmbedding.Cookie_Clicker_Alpha.S.LYD790;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Adarsh
 */
public class CookieFocused {
    static int TC ;
   
   public static void main(String[]args)throws IOException
   {
       Scanner sc=new Scanner(System.in);
       PrintWriter pw=new PrintWriter(System.out);
       TC=sc.nextInt();
       double C , F , X , R , t , New , Prev;
       for(int i=1;i<=TC;i++)
       {
           C=sc.nextDouble();
           F=sc.nextDouble();
           X=sc.nextDouble();
           R=2.0;
           
           t=0.0;
           New=0.0;
           Prev=Math.round((X/2) * 10000000.0) / 10000000.0;
           
           while(true)
           {
               New = t + (C/R) +(X/(R+F));
               New = Math.round(New * 10000000.0) / 10000000.0;
               
               if(New > Prev) break;
               
               Prev = New;
               
               t = t + C/R;
               t= Math.round(t * 10000000.0) / 10000000.0;
               
               R= R+F;
               R= Math.round(R * 10000000.0) / 10000000.0;
           }
           pw.printf("Case #%d: %.7f\n",i,Prev);
          
           
       }
       pw.close();
       
   
   }
}
