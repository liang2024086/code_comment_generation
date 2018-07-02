package methodEmbedding.Counting_Sheep.S.LYD257;


import java.util.Scanner;
import java.io.*;
import java.util.*;

public class test 
{
	public static void main(String arg [])
	{ 
		int  cout_case=1;
		//System.out.print("enter an integer value \n");
		//System.out.print("input     ");
		//System.out.println("output \n");
		
		//Scanner sc = new Scanner(System.in);
		
		 Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
	     int t = sc.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		
		while(cout_case <= t)
		{ 
		  int n,mul=1;
		  n=sc.nextInt();
		  firstPB fpb = new firstPB(n);
		  
		  fpb.compar(fpb.convert(mul*n));
		  
		  while(mul<=100 && (fpb.validate()==false))
		  {
			mul++;
			fpb.compar(fpb.convert(mul*n));
			
	      }  
		 //System.out.print(n); //value of n for the case
		  System.out.print(" case #"+cout_case+":");		
	      fpb.result(mul); 
	      cout_case++;  // completion of one case
	
		}
	}
}
