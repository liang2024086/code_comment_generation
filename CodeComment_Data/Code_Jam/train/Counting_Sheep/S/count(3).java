package methodEmbedding.Counting_Sheep.S.LYD1127;

import java.util.Scanner;
import java.io.*;

class count
{
	public static void main (String[] args)throws IOException
	{
		Scanner sc=new Scanner(System.in);                
		PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
                int n=sc.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++)
		 A[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int test=A[i]; boolean flag=true;
			int B[]={0,1,2,3,4,5,6,7,8,9};
			int c=0;
			int temp;int chk=0;
			
			while(flag==true)
			{
				flag=false;
				c=c+1;test=c*A[i];
				if(test==0)
				{ chk=1; writer.println("Case #"+(i+1)+": INSOMNIA"); break;}
				else
				{ temp=test;
				  while(temp>0)
				  {
				  	 int d=temp%10;
				  	 B[d]=-1;
				  	 temp=temp/10;
				  }
				 for(int j=0;j<10;j++)
				 { if(B[j]!=-1)
				    flag=true;
				 }
				}
				
			}	
				if(chk==0)
				writer.println("Case #"+(i+1)+": "+(test));
				
		}
	writer.close();
}
}

