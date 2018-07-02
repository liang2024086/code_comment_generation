package methodEmbedding.Cookie_Clicker_Alpha.S.LYD867;

import java.io.*;
import java.util.*;


public class Cookie{
	public static void main(String args[])throws Exception{
	BufferedReader br=new BufferedReader(new FileReader("inp.txt"));

	int tc=Integer.parseInt(br.readLine())+1,i=0,j=0,it=0,r1=0,r2=0,l=0;
        double c=0,f=0,x=0,r=2,t=0;
        StringTokenizer st=null;
	for(it=1;it<tc;it++)
	{
             st=new StringTokenizer(br.readLine());
	     c=Double.parseDouble(st.nextToken());
	     f=Double.parseDouble(st.nextToken());
	     x=Double.parseDouble(st.nextToken());
             t=0;
	     r=2;
	     i=1;
	     while(true)
	     {
              if(x/r<((x/(r+f))+(c/r)))
	      { t=t+x/r;
		break;      
	      }
	      t=t+c/r;
              r=r+f;

	     }	     
	     System.out.printf("Case #%d: %.7f",it,t);
	     System.out.println();

	}
	}}

