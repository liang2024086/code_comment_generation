package methodEmbedding.Revenge_of_the_Pancakes.S.LYD715;

import java.util.*;
import java.io.*;

class pancake{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int T = sc.nextInt();
		int cnt,last_occur;
		String s;
		char[] s_ary;
		for(int i=0;i<T;i++)
		{
			s=sc.next();
			cnt=0;last_occur=0;
			while(true)
			{
				last_occur = s.lastIndexOf('-');
				//System.out.println(last_occur);
				if(last_occur==-1)
					break;
				cnt++;
				s_ary = s.toCharArray();
				for(int j=0;j<=last_occur;j++)
				{
					if(s_ary[j]=='-')
						s_ary[j]='+';
					else
						s_ary[j]='-';
				}
				s = new String(s_ary);
			}
			System.out.println("Case #"+(i+1)+": "+cnt);			
		}
	}

}
