package methodEmbedding.Magic_Trick.S.LYD1846;

import java.util.*;
public class MagicTrick 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int init[][]=new int[4][4];
		int f[][]=new int[4][4];
		int t,i,j;
		int ans1,ans2;
		t=sc.nextInt();
		String arr[]=new String[t];
		for(int a=0;a<t;a++)
		{
			ans1=sc.nextInt();
			ans1--;
			for(i=0;i<4;i++)
			{
				for(j=0;j<4;j++)
					init[i][j]=sc.nextInt();
				
			}
			
			ans2=sc.nextInt();
			ans2--;
			for(i=0;i<4;i++)
			{
				for(j=0;j<4;j++)
					f[i][j]=sc.nextInt();
				
			}
		
			int count=0,choice=0;
			for(i=0;i<4;i++)
			{
				for(j=0;j<4;j++)
				{
					if(init[ans1][i]==f[ans2][j])
					{
						count++;
						choice=init[ans1][i];
					}
				}
			}
			
			if(count==1)
				arr[a]="Case #"+(a+1)+": "+choice;
			else if(count>1)
				arr[a]="Case #"+(a+1)+": Bad magician!";
			else if(count==0)
				arr[a]="Case #"+(a+1)+": Volunteer cheated!";
				//System.out.println("Case #"+a+": "+"Volunteer cheated!");
		}
		
		for(i=0;i<t;i++)
			System.out.println(arr[i]);
	}

}
