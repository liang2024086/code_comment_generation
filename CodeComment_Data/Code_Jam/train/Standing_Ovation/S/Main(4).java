package methodEmbedding.Standing_Ovation.S.LYD1921;

import java.io.*;
public class Main
{
public static void main(String args[]) throws Exception
{
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(ir);
	PrintWriter pw = new PrintWriter("Output.txt");
	int t = Integer.parseInt(br.readLine());
	for(int i=0;i<t;i++)
	{
		String s = br.readLine();
		String na[] = s.split(" ");
		int sm = Integer.parseInt(na[0]);
		s = na[1];
		long a[] = new long[sm+1];
		long sum = 1;
		for(int j=0;j<sm+1;j++)
			a[j]=s.charAt(j)-48;
		long c=0;
		if(a[0]==0)
			c=1;
		else
			sum = a[0];
		for(int j=1;j<sm+1;j++)
		{
			if(sum<j && a[j]>0)
			{
				c=c+j-sum;
				sum=j+a[j];
			}
			else
			{
				sum = sum + a[j];
			}
		}
		pw.println("Case #"+(i+1)+": "+c);
	}
	pw.close();
	
}
}
