package methodEmbedding.Standing_Ovation.S.LYD1144;

import java.io.*;

class codejam1
{
	public static void main(String[] args) throws Exception 
	{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(inp.readLine());
		int j=1;
		while(t>0)
		{
			String s[] = inp.readLine().split(" ");
			int max = Integer.parseInt(s[0]);
			String s1 = s[1];
			long count=s1.charAt(0)-48;
			long n=0;
			for(int i=1;i<=max;i++)
			{
				long temp = s1.charAt(i)-48;
				if(count<i && temp>0)
				{
					n=n+i-count;
					count=count+n;
				}
				count=count+s1.charAt(i)-48;
			}
			System.out.println("Case #"+j+": "+n);
			j++;
			t--;
		}
	}
}
