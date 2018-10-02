package methodEmbedding.Standing_Ovation.S.LYD157;

import java.io.*;
class jam
{
public static void main(String []args)
	{
	try
		{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(inp.readLine());
		for(int i=0;i<t;i++)
			{
			String s[]=inp.readLine().split(" ");
			int a=Integer.parseInt(s[0]);
			char ch[]=s[1].toCharArray();
			long sum=Character.getNumericValue(ch[0]);
			long get=0;
			for(int j=1;j<ch.length;j++)
				{
				if(Character.getNumericValue(ch[j])!=0)
					{
					if(sum<j)
						{
						long d=j-sum;
						get=get+d;
						sum=sum+d;
						}	
					}
					sum=sum+Character.getNumericValue(ch[j]);
				}
				int s1=i+1;
			System.out.println("Case #"+s1+":"+" "+get);
			}
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
	}
}
