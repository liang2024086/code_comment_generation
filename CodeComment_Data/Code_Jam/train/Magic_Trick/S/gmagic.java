package methodEmbedding.Magic_Trick.S.LYD1826;

import java.util.*;
import java.io.*;
/**
 * Write a description of class permute here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gmagic
{
public static void main(String args[])
{ 
     Scanner sc=new Scanner(System.in);
    int temp=0,loc=0,i=0,j=0,k=0,n=0,r1=0,r2=0,p=0,c=0;
	int ar1[][]=new int[4][4],ar2[][]=new int[4][4],rs[]=new int[4];
	try{
        sc=new Scanner(new FileInputStream("gmagicin.txt"));
		PrintWriter wr = new PrintWriter("gmagicout.txt", "UTF-8");
	 
    // System.out.println("Enter the no of Input cases");
   n=sc.nextInt();
   
  for(p=0;p<n;p++)
    { 
      
       r1=sc.nextInt();
	    System.out.println("r1="+r1);
      if(!(r1>=1 && r1<=4 ))
	  {
	  System.out.println("Error r1"+r1);
	   break;}
		
    for(i=0;i<4;i++)
     {for(j=0;j<4;j++)
     {
      ar1[i][j]=sc.nextInt(); 
	 System.out.print(ar1[i][j]+" ");
	 }System.out.println("");
	 }
	 r2=sc.nextInt();
	  System.out.println("r2="+r2);
      if(!(r2>=1 && r2<=4 ))
	  {
	  System.out.println("Error r2"+r2);
	   break;}
	   
	   for(i=0;i<4;i++)
     {for(j=0;j<4;j++)
     {
      ar2[i][j]=sc.nextInt(); 
	   System.out.print(ar2[i][j]+" ");
	 }System.out.println("");
	 }
     
	 
 for(i=0;i<4;i++)
 { temp=ar1[r1-1][i];
     for(j=0;j<4;j++) 
     {
      if(temp==ar2[r2-1][j])
	  	  {
	    rs[k]++;
		loc=j;
	  }k++;
	  }k=0;
 }
   
    for(i=0;i<4;i++)
        { if(rs[i]>0)
		    c++;
	    }
			if(c>1)
               wr.print("Case #"+(p+1)+": Bad magician!");
			 if(c==0) 
                  wr.print("Case #"+(p+1)+": Volunteer cheated!");			 
             if(c==1)
			  wr.print("Case #"+(p+1)+": "+ar2[r2-1][loc]);
         wr.println();c=0;
		  for(i=0;i<4;i++)
        { rs[i]=0;
		   
	    }
    
  }
  wr.close();
  temp=0;loc=0;i=0;j=0;k=0;r1=0;r2=0;c=0;
   }
    
    
  
	catch(Exception ex)
	{
	System.err.println(ex);
	}
  if(p!=n)
                  {
                      System.out.println("Error p!!!"+p);
                      System.exit(0);
                 
                }       
  }	
   
   
}
/*Output->
Case #1: 2 3
Case #2: 1 4
Case #3: 4 5
Case #4: 29 46
Case #5: 11 56
Case #6: 4 5
Case #7: 40 46
Case #8: 16 35
Case #9: 55 74
Case #10: 7 9
*/

