package methodEmbedding.Cookie_Clicker_Alpha.S.LYD425;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class codetest2 {
 
public static void main(String[] args) {
 
  try
  {
	  
	  Boolean isDone = true;
	  Scanner scan = new Scanner(System.in);
	  File f = new File("myop2.out");
	  FileWriter fr = new FileWriter(f);
	  BufferedWriter br1  = new BufferedWriter(fr);

	   FileInputStream in = new FileInputStream("C:/Users/pranitha/Downloads/B-small-attempt1.in");
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
 int linenum=0, casenum=0;
 int nooftestcases=0;
 strLine = br.readLine();
  nooftestcases= Integer.valueOf(strLine);
  //System.out.println("nooftestcases"+nooftestcases);
  for(int i=1;i<=nooftestcases;i++)
  {
	  
	 
		  String[] delims = br.readLine().split(" ");
		  
		double r=2, t=0;
		double c= Double.valueOf(delims[0]);
		double f1= Double.valueOf(delims[1]);
		double x= Double.valueOf(delims[2]);
		double x1 = x;
		int test=0;
		//System.out.println("c"+c+"f"+f1+"x"+x);
		/*while(x!=0)
		{
			if(x<=c)
			{
				
				float t2 = t + (x1/r);
				float t1=t + ((x1-c)/(r-f1));
				
				if((t1<=t2) && (t1>=0))
				{
					t = t1;
				}
				else
				{
					t=t2;
				}
				x=0;
			}
			else
			{
				x=x-c;
				t = t + (c/r);
				//System.out.println(""+(c/r));
				r=r+f1;
			}
				
		}
		*/
		
		while(test==0)
		{
		if(( (x/(r+f1)) + (c/r)) > (x/r))
		{
			t=t+(x/r);
			test =1;
		}
		else
		{
			t = t+ (c/r);
			r= r+f1;
		}
		}
		//float opt = (float)(t);
		String op = "Case #"+i+": "+t+"\n";
		System.out.println(op);	
		br1.write(op);
		
  }
  
  br1.close();
 
  }catch(Exception e){
   System.out.println(e);
  }
 
 }
}
