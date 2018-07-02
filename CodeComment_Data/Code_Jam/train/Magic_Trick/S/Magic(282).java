package methodEmbedding.Magic_Trick.S.LYD1850;

import java.io.*;
import java.util.*;


public class Magic{
	public static void main(String args[])throws Exception{
	BufferedReader br=new BufferedReader(new FileReader("mt.txt"));

	int tc=Integer.parseInt(br.readLine())+1,i=0,j=0,k=0,it=0,r1=0,r2=0,l=0;
        String op[]={"","Volunteer cheated!","Bad magician!"};
        StringTokenizer st=null;
	for(it=1;it<tc;it++)
	{ int nums[]=new int[17];
           r1=Integer.parseInt(br.readLine())-1;
	   for(i=0;i<4;i++)
		  {
			  st=new StringTokenizer(br.readLine());
			  if(i==r1)
				  for(j=0;j<4;j++)
                                      nums[Integer.parseInt(st.nextToken())]++;
		  }
	   r2=Integer.parseInt(br.readLine())-1;
	   for(i=0;i<4;i++)
		  {
			  st=new StringTokenizer(br.readLine());
			  if(i==r2)
				  for(j=0;j<4;j++)
                                      nums[Integer.parseInt(st.nextToken())]++;
		  }
	   l=1;
	   k=0;
	   for(i=1;i<17;i++)
	   { if(nums[i]==2)
		   {
			  if(k==0)
			  { k=1; 
		            l=0;
			    op[l]=""+i;
			  }
			 else
			 {l=2;
			  break;	 
			 }	 
		   }

	   }
	   System.out.println("Case #"+it+": "+op[l]);
	  
	}
	
	}}
