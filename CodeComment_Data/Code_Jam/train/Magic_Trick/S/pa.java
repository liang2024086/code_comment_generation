package methodEmbedding.Magic_Trick.S.LYD1353;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class pa {

public static void main(String []args) throws Exception{
		
		Scanner s=new Scanner(new File("/Users/Rahul/Desktop/A-small-attempt0.in"));
		System.setOut(new PrintStream(new FileOutputStream(new File("/Users/Rahul/Desktop/out.txt"))));
		int k,test;
		int a[]=new int[4];
		int b[]=new int[4];
		int ax,bx,i,j,c,pos=-1;
		test=s.nextInt();
		s.nextLine();
		for(k=1;k<=test;k++)
		{
			c=0;
			ax=s.nextInt();
			for(i=0;i<4;i++)
			{
				s.nextLine();
				if((i+1)==ax)
				{
					for(j=0;j<4;j++)
					{
						a[j]=s.nextInt();
					}
				}
			}
			s.nextLine();
			bx=s.nextInt();
			for(i=0;i<4;i++)
			{
				s.nextLine();
				if((i+1)==bx)
				{
					for(j=0;j<4;j++)
					{
						b[j]=s.nextInt();
					}
				}
			}
			s.nextLine();
			for(i=0;i<4;i++)
			{
				for(j=0;j<4;j++)
				{
					if(a[i]==b[j])
					{
						c++;
						pos=a[i];
						
					}
				}
			}
			if(c>1)
			{
				System.out.println("Case #"+k+": Bad magician!");
			}
			else if(c==1)
			{
				System.out.println("Case #"+k+": "+pos);
			}
			else
			{
				System.out.println("Case #"+k+": Volunteer cheated!");
			}
			
			
		}
	}
	
}
