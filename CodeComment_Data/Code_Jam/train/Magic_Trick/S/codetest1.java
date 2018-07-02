package methodEmbedding.Magic_Trick.S.LYD572;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class codetest1 {
 
public static void main(String[] args) {
 
  try
  {
	  
	  Boolean isDone = true;
	  Scanner scan = new Scanner(System.in);
	  File f = new File("myop1.out");
	  FileWriter fr = new FileWriter(f);
	  BufferedWriter br1  = new BufferedWriter(fr);

	   FileInputStream in = new FileInputStream("C:/Users/pranitha/Downloads/A-small-attempt1.in");
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
 int linenum=0, casenum=0;
 int nooftestcases=0;
 strLine = br.readLine();
  nooftestcases= Integer.valueOf(strLine);
  //System.out.println("nooftestcases"+nooftestcases);
  for(int i=1;i<=nooftestcases;i++)
  {
	  
	  int m1[] = new int[16];
	  int m2[] = new int[16];
	  int r1[] = new int[4];
	  int r2[] = new int[4];
	  int rownum1= Integer.valueOf(br.readLine());  
	 // System.out.println("r1"+rownum1);
	  for(int x=0;x<4;x++)
	  {
		  String[] delims = br.readLine().split(" ");
		  if(x+1 == rownum1)
		  {
			  for(int j1=0;j1<4;j1++)
			  {
				r1[j1] = Integer.valueOf(delims[j1]);  
				//System.out.println("r1 val"+r1[j1]);
			  }
		  }
	}
	 
	  int rownum2= Integer.valueOf(br.readLine());  
	 // System.out.println("r2"+rownum2);
	  for(int x=0;x<4;x++)
	  {
		  String[] delims = br.readLine().split(" ");
		  if(x+1 == rownum2)
		  {
			  for(int j1=0;j1<4;j1++)
			  {
				r2[j1] = Integer.valueOf(delims[j1]);  
				//System.out.println("r1 val"+r2[j1]);
			  }
		  }
	}
	  
	int  noofmatches=0,matchednum=9999;
	for(int i1=0;i1<4;i1++)
	{
		for(int j=0;j<4;j++)
		{
			if(r1[i1] == r2[j])
			{
				matchednum=r1[i1];
				noofmatches++;
			}
		}
	}
	String op;
	if(noofmatches==0)
	{
		//System.out.println("Case #"+i+": Bad magician!");	
		op = "Case #"+i+": Volunteer cheated!\n";
		//op = "Case #"+i+": Bad magician!\n";
		System.out.println(op);	
		br1.write(op);
	}
	else if(noofmatches==1)
	{
		//System.out.println("Case #"+i+": "+matchednum);
		op = "Case #"+i+": "+matchednum+"\n";
		System.out.println(op);	
		br1.write(op);
	}
	else
	{
		//System.out.println("Case #"+i+": Volunteer cheated!");
		
		op = "Case #"+i+": Bad magician!\n";
		System.out.println(op);	
		br1.write(op);
	}
  }
  
  br1.close();
 
  }catch(Exception e){
   System.out.println(e);
  }
 
 }
}
