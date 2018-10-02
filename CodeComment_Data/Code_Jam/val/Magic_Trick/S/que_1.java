package methodEmbedding.Magic_Trick.S.LYD520;


import java.util.*;
import java.io.*;

public class que_1
{
	public static void main(String args[]) throws Exception
	{
		int nt,an1,an2,i,j,k,cn=0,ans=0;
		
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
        Scanner s =new Scanner(new FileReader("A-small-attempt1.in"));
	PrintWriter pw=new PrintWriter("out.in");
		
		nt=s.nextInt();
		
for(k=0;k<nt;k++)
	{	
		
		
		an1=s.nextInt();
		
		
		for(i=1;i<5;i++)
		{
			for(j=1;j<5;j++)
			{
				a[i][j]=s.nextInt();
				
		    }
		}
		
	
		
		
		an2=s.nextInt();
		
			for(i=1;i<5;i++)
		{
			for(j=1;j<5;j++)
			{
				b[i][j]=s.nextInt();
				
		    }
		}
		
		for(i=1;i<5;i++)
		{
			for(j=1;j<5;j++)
			{
				if(a[an1][i]==b[an2][j])
				{
					
				    ans=a[an1][i];
					
					cn++;
				}
			}
		}


		
		
		if(cn==1)
		{
		    pw.println("Case #"+(k+1)+": "+ans);
		}
		
		else if(cn>1)
		{
		  pw.println("Case #"+(k+1)+": "+"Bad magician!");
		}
		else
		{
		  pw.println("Case #"+(k+1)+": "+"Volunteer cheated!");
		}
		
		pw.flush();
		
		cn=0;
	}
	
	pw.close();
	s.close();

	
	}
	}
	

     	
		
		
		
		
		
		
		
		
