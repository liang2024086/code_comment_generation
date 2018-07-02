package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1291;

/**
  * @author (Mohammad Daoud Farooqi) 
  * @version (Mark I)
  */

import java.io.*;
import java.util.*;
import java.text.*;

public class gcookie
{
public static void main(String args[])
{ 
    Scanner sc=new Scanner(System.in);
    int t=0,n=0;
	double X=0.0,F=0.0,C=0.0,x1=0.0,x2=0.0,fbt=0.0,rate=2.0,dx=0.0;
	
	try{
        sc=new Scanner(new FileInputStream("gcookiein.txt"));
		PrintWriter wr = new PrintWriter("gcookieout.txt", "UTF-8");
	    DecimalFormat df = new DecimalFormat("#.#######");

   n=sc.nextInt();
   
  for(t=0;t<n;t++)
    { 
      
       C=sc.nextDouble();
	
      if(!(C>=1 && C<=500))
	  {
	  System.out.println("Error C="+C);
	   break;}
	   F=sc.nextDouble();
	  
      if(!(F>=1 && F<=4))
	  {
	  System.out.println("Error F="+F);
	   break;}
	   X=sc.nextDouble();
	  
      if(!(X>=1 && X<=2000))
	  {
	  System.out.println("Error X="+X);
	   break;}
		
    do
	{
	x1=X/rate +fbt;
	fbt+=C/rate;
	rate+=F;
	x2=X/rate +fbt;
	}while(x1>x2);
   dx=Double.parseDouble(df.format(x1));
             wr.print("Case #"+(t+1)+": "+dx);
         wr.println();
		 fbt=0.0;
		 rate=2.0;
		 
  }
  wr.close();
  }
  	catch(Exception ex)
	{
	System.err.println(ex);
	}
  if(t!=n)
                  {
                      System.out.println("Error t!!!"+t);
                      System.exit(0);
                 
                }       
   }	
  
   
}
