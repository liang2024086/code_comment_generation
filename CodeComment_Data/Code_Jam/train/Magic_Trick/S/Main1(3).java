package methodEmbedding.Magic_Trick.S.LYD491;

import java.util.Scanner;
import java.io.*;
public class Main1 {
	
	public static void main(String args[])
	{
		File f=new File("q.in.in");
		
		Scanner a=null;;
		try
		{
			a=new Scanner(f);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		int test=Integer.parseInt(a.nextLine().trim());
		int u=1;
		while(u<=test)
		{
			
			int ans1,ans2;
			int finalAnswer = 0,count=0;
			int firstConfig[][]=new int[4][4];
			int secondConfig[][]=new int[4][4];
			ans1=Integer.parseInt(a.nextLine());
			
			String partsFirstConfiguration[][]=new String[4][4];
			for(int i=0;i<4;i++)
			{
				
				partsFirstConfiguration[i]=a.nextLine().trim().split(" ");
				for(int j=0;j<4;j++)
				firstConfig[i][j]=Integer.parseInt(partsFirstConfiguration[i][j].trim());
			}
			ans2=Integer.parseInt(a.nextLine().trim());
			for(int i=0;i<4;i++)
			{
				
				partsFirstConfiguration[i]=a.nextLine().trim().split(" ");
				for(int j=0;j<4;j++)
				secondConfig[i][j]=Integer.parseInt(partsFirstConfiguration[i][j].trim());
			}
			int arr[]=new int[17];
			for(int i=0;i<17;i++)
			{
				arr[i]=0;
			}
			
			
			for(int i=0;i<4;i++)
			{
				arr[firstConfig[ans1-1][i]]++;
			}
			
			for(int i=0;i<4;i++)
			{
				if(arr[secondConfig[ans2-1][i]]==1)
				{
					
					count++;
					finalAnswer=secondConfig[ans2-1][i];
				}
			}
			
			if(count==1)
			{
				System.out.println("case #"+u+": "+finalAnswer);
			}
			if(count==0)
			{
				System.out.println("case #"+u+": "+"Volunteer cheated!");
			}
			if(count>1)
				System.out.println("case #"+u+": "+"Bad magician!");
			u++;
		}
	}

}
