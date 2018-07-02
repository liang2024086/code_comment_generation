package methodEmbedding.Magic_Trick.S.LYD882;

import java.util.Scanner;


public class Main 
{
	public static void main(String args[])
	{
		int test;
		Scanner s = new Scanner(System.in);
		
		test = s.nextInt();
		
		for(int i=1;i<=test;i++)
		{
			int row1=s.nextInt();
			for(int j=0;j<row1;j++)
				s.nextLine();
			
			int row[]=new int [4];
			
			row[0]=s.nextInt();
			row[1]=s.nextInt();
			row[2]=s.nextInt();
			row[3]=s.nextInt();
			
			for(int j=row1;j<=4;j++)
				s.nextLine();
			
			int row2=s.nextInt();
			for(int j=0;j<row2;j++)
				s.nextLine();
			
			int row22[]=new int [4];
			
			row22[0]=s.nextInt();
			row22[1]=s.nextInt();
			row22[2]=s.nextInt();
			row22[3]=s.nextInt();
			
			for(int j=row2;j<=4;j++)
				s.nextLine();
			int count=0;
			int ans=-1;
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					if(row22[k]==row[j])
					{
						ans=row[j];
						count++;
					}
				}
			}
			if(count==1)
				System.out.println("Case #"+i+": "+ans);
			else if(count==0)
				System.out.println("Case #"+i+": "+"Volunteer cheated!");
			else
				System.out.println("Case #"+i+": "+"Bad magician!");
		}
	}
}
