package methodEmbedding.Speaking_in_Tongues.S.LYD1097;

import java.io.*;

class speaking
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br=new BufferedReader(new FileReader("inputA.in"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("outputA.txt"));
		int T;
		String s;
		char c[],translate[]={'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		s=br.readLine();
		T=Integer.parseInt(s);
		for(int i=0;i<T;i++)
		{
			s=br.readLine();
			c=new char[s.length()];
			for(int j=0;j<s.length();j++)
			{
				
				if(s.charAt(j)==' ')
				c[j]=' ';
				else
				c[j]=translate[(int)(s.charAt(j)-'a')];
			}
			s=new String(c);
			bw.write("Case #"+(i+1)+": "+s);
			if(i!=T-1)
			bw.write("\n");
		}
		br.close();
		bw.close();
	}
}
