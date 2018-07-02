package methodEmbedding.Speaking_in_Tongues.S.LYD156;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Translate {
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader f = new BufferedReader(new FileReader("translate.in"));
		char[] trans = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 
				't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};

		
		int T = Integer.parseInt(f.readLine());
		
		
		for (int i = 0; i < T; i++)
		{
			String s = f.readLine();
			String ret = "";
			
			for (int j = 0; j < s.length(); j++)
			{
				char c = s.charAt(j);
				char a = 'a';
				if (c == ' ')
					ret += c;
				else
					ret += trans[c - a];
			}
			System.out.println("Case #" + (i+1) + ": " + ret);
		}
		
		
	}
}
