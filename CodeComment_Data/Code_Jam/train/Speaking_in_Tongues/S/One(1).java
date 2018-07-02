package methodEmbedding.Speaking_in_Tongues.S.LYD745;

import java.io.*;

class One
{
	public static void main(String args[]) throws IOException
	{
		char map[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		String str,s;
		int T;
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		s=buf.readLine();
		T=Integer.parseInt(s);
		for(int i=0;i<T;i++)
		{
			str=buf.readLine();
			System.out.print("Case #"+(i+1)+": ");
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)==' ')
					System.out.print(str.charAt(j));
				else
					System.out.print(map[str.charAt(j)-'a']);
			}
			System.out.println();
		}
	}
}
