package methodEmbedding.Counting_Sheep.S.LYD730;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CountingSheep 
{
	private static int number[]={0,1,2,3,4,5,6,7,8,9};
	public static void main(String args[])
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int T=Integer.parseInt(br.readLine());
			int o[]=new int[T];
			for(int i=0;i<T;i++)
			{
				int check[]=new int[10];
				int N=Integer.parseInt(br.readLine());
				for(int j=1;N*j<100000000;j++)
				{
					int num=N*j;
					int dup=num;
					if(num==0)
					{
						o[i]=0;
						break;
					}
					while(dup>0)
					{
						check[dup%10]=1;
						dup=dup/10;
					}
					if(num%10==0)
					{
						check[0]=1;
					}
					int temp=0;
					for(int k=0;k<10;k++)
					{
						if(check[k]==0)
						{
							temp=1;
							break;
						}
					}
					if(temp==1)
					{
						o[i]=0;
					}
					else
					{
						o[i]=num;
						break;
					}
				}
			}
			for(int i=0;i<T;i++)
			{
				if(o[i]==0)
				{
					System.out.println("Case #"+(i+1)+": INSOMNIA");
				}
				else
				{
					System.out.println("Case #"+(i+1)+": "+o[i]);
				}
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
