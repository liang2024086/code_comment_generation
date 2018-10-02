package methodEmbedding.Counting_Sheep.S.LYD1133;

import java.io.*;

public class sheep
{
	public static void main(String [] args) throws IOException
	{
	boolean[] a;
	int test;
	int tc=0;
	BufferedReader  br=new BufferedReader(new InputStreamReader(System.in));
	test=Integer.parseInt(br.readLine());
	while(tc++ != test)
	{
		a=new boolean[10];
		int n=Integer.parseInt(br.readLine());
		int ni=n;
		int i;
		int ans=n;
		i=1;
		if(n == 0)
			System.out.println("Case #"+tc+": INSOMNIA");
		else
		{
			while(ni != 0)
			{
				int rem=ni%10;
				ni/=10;
				if(!a[rem])
					a[rem]=true;
				
				if(a[0]&&a[1]&&a[2]&&a[3]&&a[4]&&a[5]&&a[6]&&a[7]&&a[8]&&a[9])
				{
					System.out.println("Case #"+tc+": "+ans);
					break;
				}
				else if(ni == 0)
				{
					ni=n*++i;
					ans=ni;
				}
					
			}
		}
	}
	}
}
