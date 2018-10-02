package methodEmbedding.Revenge_of_the_Pancakes.S.LYD761;

import java.util.*;

class prg2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t,s;
		t=sc.nextInt();
		s=1;
		while(t>0)
		{
			String st;
			st=sc.next();
			StringBuilder sb=new StringBuilder(st);
			int count=0;
			int len=sb.length();
			boolean done=false;
			while(!done)
			{
				int fm;
				for(fm=0;fm<len && sb.charAt(fm)!='-';++fm);
				if(fm==len)
					done=true;
				else
				{
					if(fm==0)
					{
						int i,j;
						for(i=0;i<len && sb.charAt(i)!='+';++i);
						for(j=0;j<i;++j)
							sb.setCharAt(j,'+');
						++count;
					}
					else
					{
						int i;
						for(i=0;i<fm;++i)
							sb.setCharAt(i,'-');
						++count;
					}
				}
			}
			System.out.println("Case #"+s+": "+count);
			++s;
			--t;
		}
	}
}
