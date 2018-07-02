package methodEmbedding.Speaking_in_Tongues.S.LYD362;

import java.io.*;
import java.util.*;

public class First
{
	public static void main(String[]args)throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));
		PrintWriter filew = new PrintWriter(new File("A-small.out"));	
		int cases = Integer.parseInt(br.readLine());
		char [] alpha = {'y', 'h', 'e', 's', 'o', 'c', 'v', 'x', 'd', 'u', 'i', 'g', 'l', 'b', 'k', 'r', 'z', 't', 'n', 'w', 'j', 'p', 'f', 'm', 'a', 'q'};
		for(int i = 0; i < cases; i++)
		{
			String str = br.readLine();
			String res = "";
			for(int j = 0; j < str.length(); j++)
			{
				char c = str.charAt(j);
				if(c == ' ')
					res += ' ';
				else
					res += ((char)alpha[c-'a']);
			}
			//System.out.println(res);
			filew.printf("Case #%d: %s\n", i+1, res);
		}
		filew.close();
		filew.flush();
	}
}
