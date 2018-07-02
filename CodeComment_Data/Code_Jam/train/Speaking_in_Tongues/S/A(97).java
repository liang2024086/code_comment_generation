package methodEmbedding.Speaking_in_Tongues.S.LYD1168;

import java.io.*;
import java.util.*;

class A
{
	public static void main(String[] args) 
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader("A.in"));
			PrintWriter pw = new PrintWriter(new FileWriter("A.out"));
			int X = Integer.parseInt(br.readLine());

			for(int i=0; i<X; i++)
			{
				char[] S2G = new char[] {'y','h','e','s','o','c','v','x','d','u','i','g','l','b','k','r','z','t','n','w','j','p','f','m','a','q'};
				String G = br.readLine();
				String S = "";
				for(int j=0; j<G.length(); j++)
					if(G.charAt(j) != ' ')
						S += S2G[G.charAt(j) - 'a'];
					else
						S += ' ';

				pw.printf("Case #%d: %s\n", i+1, S);
				pw.flush();
			}
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
	}
}
