package methodEmbedding.Speaking_in_Tongues.S.LYD1016;

import java.util.*;
import java.io.*;
class A 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new FileReader("A-small-attempt1.in"));
		FileWriter fw = new FileWriter("A-small-attempt1.out");
		int T = new Integer(in.readLine());
		char az[] = {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
		String output = "";
		int m,n ;
		for (int cases = 1; cases <= T; cases++)
		{	
			StringTokenizer st = new StringTokenizer(in.readLine());
			fw.write("Case #" + cases + ": ");
			n = st.countTokens();
			for (int i = 0;i < n ;i++ )
			{
				char a[] = st.nextToken().toCharArray();
				for (int j = 0;j < a.length ;j++ )
				{
					m = (int)a[j] - 97;
					output += az[m];
				}
				output += " ";
			}
			
			fw.write(output +"\n");
			output = "";
		}
		fw.flush();
		fw.close();
	}
	
}
