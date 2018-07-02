package methodEmbedding.Revenge_of_the_Pancakes.S.LYD933;

import java.util.*;
class revengePancake{
	public static void main(String arg[])
	{
		int t,i=1;
		String str;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		while(t-- >0)
		{
			str=sc.next();
			int j=0,ans=0;
			System.out.print("Case #"+i+": ");
			while(j<str.length())
				if(str.charAt(j)=='-')
					++j;
				else
					break;
			if(j!=0)
				++ans;
			boolean flag=false;
			while(j<str.length())
			{
				if(str.charAt(j)=='-')
					flag=true;
				if(str.charAt(j)=='+')
				{
					if(flag)
					{
						ans+=2;
						flag=false;
					}
				}
				++j;				
			}
			if(flag)
				ans+=2;
			System.out.println(ans);
			
			++i;
		
		}
	}
}
