package methodEmbedding.Counting_Sheep.S.LYD1544;

import java.util.*;

class prg
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t,s;
		t=sc.nextInt();
		s=1;
		while(t>0)
		{
			int N;
			N=sc.nextInt();
			int i,product=0;
			Set<Integer> set = new HashSet<Integer>();
			if(N==0)
				System.out.println("Case #"+s+": INSOMNIA");
			else
			{
				for(i=1;set.size()<10;++i)
				{
					product+=N;
					int k=product;
					while(k!=0 && set.size()<10)
					{
						set.add(k%10);
						k/=10;
					}
				}
				System.out.println("Case #"+s+": "+product);
			}
			++s;
			--t;
		}
	}
}
