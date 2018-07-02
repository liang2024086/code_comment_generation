package methodEmbedding.Counting_Sheep.S.LYD241;

import java.util.*;
import java.io.*;
public class Sheep {
	
	static int T;
	static long N;
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		T=sc.nextInt();
		int c=1;
		while(T!=0)
		{
			long count[]={0,0,0,0,0,0,0,0,0,0},incr=1,num,store;
			int dig,check=0,confirm=0;
			N=sc.nextLong();
			inner:while(true)
			{
				if(N<=0)
				{
					System.out.println("Case #"+c+": INSOMNIA");
					break inner;
				}
				num=N*incr;
				store=num;
				while(num!=0)
				{
					dig=(int)num%10;
					count[dig]++;
					num/=10;
				}
				incr++;
				while(check<10)
				{
					if(count[check]!=0)
					{
						confirm++;
					}
					else
					{
						break;
					}
					check++;
				}
				if(confirm==10)
				{
					System.out.println("Case #"+c+": "+store);
					break;
				}
			}
			T--;
			c++;
		}
	}
	
}
