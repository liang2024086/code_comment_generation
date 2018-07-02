package methodEmbedding.Cookie_Clicker_Alpha.S.LYD599;


import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;


class Main  

 {
		public static long ans;
		//public static int[] arr=new int[17];
  public static void main(String[] args)throws Exception

    {                 

 	                BufferedReader br=new BufferedReader(new FileReader("B-small-attempt0.in"));
	   BufferedWriter out=new BufferedWriter(new FileWriter("output.txt"));
    
    
    
      // byte digit[]=new byte[101];
	 //boolean[] check=new boolean[101];
     //int num[]=new int[99999]; 
        ans=0;     
        int tests=Integer.parseInt(br.readLine());
     
    for(int t=0;t<tests;t++){
					double c=0.000000,f=0.000000,x=0.000000;String[] ss=br.readLine().split(" ");			
					c=Double.parseDouble(ss[0]); f=Double.parseDouble(ss[1]);  x=Double.parseDouble(ss[2]); 	
					//int num[]=new int[n];					
					//String[] ss=br.readLine().split(" ");    
					double t1=0.000000,t2=0.000000,d=0.0000000;
					if(c>=x){out.write("\nCase #"+(t+1)+": "+(x/2.0000000));out.flush();continue;}
					d=2.0;
					t1=x/d;
					t2+=c/d;
					d+=f;
					t2+=x/d;

					while(t1>t2){
						t1=t2;
					t2-=x/d;
					t2+=c/d;
					d+=f;
					t2+=x/d;

					}
					//out.printf("\nCase #%d+:%.7f",(t+1),t1);out.flush();
					out.write("\nCase #"+(t+1)+": "+t1);out.flush();
		}		
        			
  		      
  }
}
