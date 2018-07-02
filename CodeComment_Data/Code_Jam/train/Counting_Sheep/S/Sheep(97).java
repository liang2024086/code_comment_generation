package methodEmbedding.Counting_Sheep.S.LYD211;

import java.util.*;
class Sheep
{	
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a;
		int N,temp;
		int count =0;
		int ans[]=new int[n];

		while(count < n)
		{	N=in.nextInt();

			temp=N;
			int inc=1;
			boolean flag=false;
			int arr[]=new int[10];
			while(!flag&&inc<=10000000)
			{	
				
				while(N!=0)
				{
					a=N%10;
					arr[a]=1;
					N=N/10; 
				}
				for(int i=0;i<10&&arr[i]==1;i++)
					if(i==9)
						{
							flag=true;
						}
				if(!flag)
					N=temp*(++inc);
			
			}
			if(inc==10000001)
				ans[count]=-1;
			else
				ans[count]=inc*temp;
			count++;
		}
		for(int i=1;i<=n;i++)
			if(ans[i-1]==-1)
				System.out.println("Case #"+i+": INSOMNIA");
			else
				System.out.println("Case #"+i+": "+ans[i-1]);
	}

}
