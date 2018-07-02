package methodEmbedding.Counting_Sheep.S.LYD838;

import java.io.*;
import java.util.*;
class CJ1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int z=1;z<=t;z++)
		{
			long n=Long.parseLong(br.readLine());
			long x=n;
			if(x==0)
				System.out.println("Case #"+z+": INSOMNIA");
			else
			{
			String num;
			char arr[]=new char[10];
			for(int i=0;i<10;i++)
				arr[i]='X';
			boolean done=false;
			int len,mul=1;
			while(!done)
			{
				num=""+x;
				len=num.length();
				for(int i=0;i<len;i++)
				{
					arr[(int)num.charAt(i)-(int)'0']=num.charAt(i);
				}
				boolean f=true;
				for(int i=0;i<10;i++)
				{
					if(arr[i]=='X')
					{
						f=false;
						break;
					}
				}
				done=f;
				if(done==true)
				break;
				x=(++mul)*n;
			}
			System.out.println("Case #"+z+": "+x);
		}
		}
	}
}
