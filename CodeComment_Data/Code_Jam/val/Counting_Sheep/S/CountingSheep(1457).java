package methodEmbedding.Counting_Sheep.S.LYD1632;

import java.util.*;
import java.io.*;

public class CountingSheep
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t=in.nextInt();
		int temp,j;
		boolean[] count=new boolean[10];
		boolean b;
		for(int i=0;i<t;i++)
		{
			int num=in.nextInt();
			if(num==0)
				System.out.println("Case #"+(i+1)+": INSOMNIA");
			else
			{
				for(int k=0;k<10;k++)
					count[k]=false;
				b=false;
				for(j=1;!b;j++)
				{
					temp=j*num;
					//System.out.println(temp);
					while(temp>0)
					{
						count[temp%10]=true;
						temp/=10;
					}
					b=true;
					for(int k=0;k<10;k++)
						b=b&count[k];
				}
				System.out.println("Case #"+(i+1)+": "+num*(j-1));
			}
		}
	}
}
