package methodEmbedding.Speaking_in_Tongues.S.LYD530;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;


public class Run
{
	public static void main(String[] args)
	{
		String path = "files/A-small-attempt1.in";
		
		int T = 0;
		ArrayList<String> G = new ArrayList<String>();
		
		try
		{
			boolean isFirstLine = true;
			FileReader FR = new FileReader(path);
			BufferedReader BR = new BufferedReader(FR);
			String str = "";
			
			while((str=BR.readLine())!=null)
			{
				if (isFirstLine)
				{
					T = Integer.parseInt(str);
					isFirstLine = false;
				}
				G.add(str);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		String inputCase = "ejp mysljylc kd kxveddknmc re jsicpdrysi rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd de kr kd eoya kw aej tysr re ujdr lkgc jv z q";
		String outputCase = "our language is impossible to understand there are twenty six factorial possibilities so it is okay if you want to just give up q z";
		
		HashMap<Character, Character> maps = new HashMap<Character, Character>();
		for (int i = 0; i < inputCase.length(); i++)
		{
			if (inputCase.charAt(i) != ' ' && !maps.containsKey(inputCase.charAt(i)))
			{
				maps.put(inputCase.charAt(i), outputCase.charAt(i));
			}
		}
		
		for (int i = 0; i < G.size(); i++)
		{
			System.out.print("Case #"+i+": ");
			String str = G.get(i);
			for (int j = 0; j < str.length(); j++)
			{
				char c = str.charAt(j);
				if (c == ' ')
				{
					System.out.print(" ");
				}
				else if (maps.containsKey(c))
				{
					System.out.print(maps.get(c));
				}
				else
				{
					System.out.print(c);
				}
			}
			System.out.println();
		}
	}
}
