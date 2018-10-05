package methodEmbedding.Counting_Sheep.S.LYD1082;

import java.io.*;
class sleep
{
	public static void main(String []args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=1;i<=t;i++)
		{
			int n=Integer.parseInt(br.readLine());
			if(n==0)
			{
				System.out.println("Case #"+String.valueOf(i)+": "+"INSOMNIA");
			}
			else
			{
				int flag=0;
				int ar[]=new int[10];
				int value=0;
				int k=2;
				int y=n;
				while(true)
				{
				int x=n;	
				while (n>0) 
				{
				ar[n%10]=1;
				n= n/ 10;
				}
				
				for(int j=0;j<10;j++)
				{
					if(ar[j]==0)
					{
						break;
					}
					else
					{
						if(j==9&&ar[j]==1)
						{
							flag=1;
							break;
						}
					}
				}
				if(flag==0)
				{
					n=k*y;
					k++;
				}
				else
				{
					value=x;
					break;
				}
				}
			System.out.println("Case #"+String.valueOf(i)+": "+String.valueOf(value));	
			}
		}
	}
}
