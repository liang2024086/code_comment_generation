package methodEmbedding.Counting_Sheep.S.LYD503;

import java.io.*;
class solve {
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(in.readLine());
		int c=1;
		while(test-->0)
		{
			long n = Integer.parseInt(in.readLine());
			if(n==0)
			{
				System.out.println("Case #"+c+": INSOMNIA");
				c++;
				continue;
			}
			boolean check[]=new boolean[10];
			
			for(int i=0;i<10;i++)
				check[i]=false;
				
			boolean control=true;
			long temp = n;
			long o_n = n;
			long move = 2;
			while(control)
			{
				temp=n;
				while(temp!=0)
				{
					check[(int)temp%10]=true;
					temp=temp/10;
				}
				
				for(int i=0;i<10;i++)
					{
						if(check[i]==false)
						{
							n = o_n*move;
							move++;
							control=true;
							break;
						}
						else
						{
							control=false;
						}
					}
			}
			System.out.println("Case #"+c+": "+n);
				c++;
		}
		
	}
}
