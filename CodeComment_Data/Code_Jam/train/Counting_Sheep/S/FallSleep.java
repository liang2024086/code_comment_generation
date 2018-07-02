package methodEmbedding.Counting_Sheep.S.LYD23;

import java.io.*;
import java.util.*;


public class FallSleep{

   public static void main(String args[])throws Exception{
      
      long vals[]=new long[1000001];
      long digits[]=new long[10];
      long k=0,r=0;
      int i=0,j=0,count=0,i1=0,n=0;
      for(i=1;i<vals.length;i++)
      {
	    count=10;
            j=1;
	    digits=new long[10];
	    while(count>0)
	    {
                 vals[i]=i*j;
		 if(vals[i]<0)
		 {
			 System.out.println("Overflow detected");
			 i=vals.length;
			 break;
		 }

		 j++;
		 k=vals[i];

		 while(k>0)
		 {
		    
	            r=k%10;
	            k=k/10;
	            if(digits[(int)r]==0)
		     {
			     count--;
			     digits[(int)r]=1;
		     }	     
		 } 
                 
                
	    }


	  //   System.out.println(i+" "+vals[i]);
      }

      BufferedReader br=new BufferedReader(new FileReader("e:/gcj16/A-small-attempt0.in"));
      PrintWriter pw=new PrintWriter("e:/gcj16/fallsleepout.txt");
      int tcase=Integer.parseInt(br.readLine())+1;
      String op="";
      for(i1=1;i1<tcase;i1++)
      {      n=Integer.parseInt(br.readLine());
	     if(n==0)
                op="Case #"+i1+": INSOMNIA";
	     else
                op="Case #"+i1+": "+vals[n];

	     System.out.println(op);
	     pw.println(op);
      }

      pw.close();


   
   }

}
