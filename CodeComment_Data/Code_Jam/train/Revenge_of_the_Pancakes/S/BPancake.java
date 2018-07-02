package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1061;

import java.io.*;
public class BPancake
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int loop=1; loop<=T; loop++)
		{
			String str = br.readLine();
			int n = str.length();
			
			String ans = "";
			int i;
			for(i=0; i<n; i++)
			{
				ans+='+';
			}
		//	System.out.println(ans+" "+str);
			int count=0;
			while(!(str.equals(ans)))
			{
				char c = str.charAt(0);
				int kk=0;
				char newC;
				if(c=='+')
					newC='-';
				else
					newC='+';
				String replace="";
				while(kk<n && c==str.charAt(kk))
				{
					kk++;
					replace += newC;
				}
				
		//		System.out.println("replace:"+replace);
				str = replace.substring(0,kk) + str.substring(kk, n);
				count++;

		//	System.out.println(ans+" "+str);
			}
			System.out.println("Case #"+loop+": "+count);
		}
	}
}
