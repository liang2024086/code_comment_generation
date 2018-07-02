package methodEmbedding.Magic_Trick.S.LYD2054;

import java.util.*;
public class mathbox {
public static void main(String ar[])
{
	int T;
	int common=0;
	Scanner input=new Scanner(System.in);
	T=input.nextInt();
	int choice1,choice2;
	int a[]=new int[4];
	int b[]=new int[4];
	int magic[][]=new int[4][4];
	for(int i=1;i<=T;i++)
	{
		common=0;
		choice1=input.nextInt();
		for(int j=0;j<4;j++)
		{
			for(int k=0;k<4;k++)
			{
				magic[j][k]=input.nextInt();
				if(j==choice1-1)
					a[k]=magic[j][k];
			}
		}
		choice2=input.nextInt();
		for(int j=0;j<4;j++)
		{
			for(int k=0;k<4;k++)
			{
				magic[j][k]=input.nextInt();
				if(j==choice2-1)
					b[k]=magic[j][k];
			}
		}
		int ele=0;
		for(int j=0;j<4;j++)
		{
			for(int k=0;k<4;k++)
			if(b[j]==a[k])
				{
				ele=b[j];
				common++;
				break;
				}
		}
		
		if(common==0)
			System.out.println("Case #"+i+": Volunteer cheated!");
		else if(common==1)
			System.out.println("Case #"+i+": "+ ele);
		else
			System.out.println("Case #"+i+": Bad magician!");
	}
}
}
