package methodEmbedding.Magic_Trick.S.LYD524;

import java.io.*;
import java.util.*;

public class Magic
{
   public static void main(String[] args) throws IOException
   {
      Scanner x;
	  int a[][]=new int[4][4];
	  int match1[]=new int[4];
	  int match2[]=new int[4];
	  PrintWriter out = new PrintWriter("Output.txt");
	  x=new Scanner(new File("small_input.txt"));
	     int T=Integer.parseInt(x.next());
		 int i;
		 int r;
		 for(i=0;i<T;i++)
		 {
		    r=Integer.parseInt(x.next());
			int j,k;
			for(j=0;j<4;j++)
			{
			  for(k=0;k<4;k++)
			  {
			     a[j][k]=Integer.parseInt(x.next());
			  }
			}
			r=r-1;
			for(j=0;j<4;j++)
			{
			  match1[j]=a[r][j];
			}
			r=Integer.parseInt(x.next());
			for(j=0;j<4;j++)
			{
			  for(k=0;k<4;k++)
			  {
			     a[j][k]=Integer.parseInt(x.next());
			  }
			}
			r=r-1;
			for(j=0;j<4;j++)
			{
			  match2[j]=a[r][j];
			}
			int count=0;
			int num=0;
			for(j=0;j<4;j++)
			{
			   for(k=0;k<4;k++)
			   {
			      if(match1[j]==match2[k])
				  {
				     count++;
					 num=match1[j];
				  }
			   }
			}
			int m=i+1;
			if(count==1)
			{
			  String q="Case #"+m+": "+num;
			  System.out.println(q);
			}
			if(count>1)
			{
			  System.out.println("Case #"+m+": Bad magician!");
			}
			if(count==0)
			{
			  System.out.println("Case #"+m+": Volunteer cheated!");
			}
		 }
		 
	  
   }
   
}
