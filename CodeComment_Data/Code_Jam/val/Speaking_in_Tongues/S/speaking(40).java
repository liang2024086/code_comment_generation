package methodEmbedding.Speaking_in_Tongues.S.LYD52;

import java.io.*;
import java.util.*;

public class speaking
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new FileReader("speaking.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speaking.out")));
		
		TreeMap<Character, Character> map = new TreeMap<Character, Character>();
		
		
		String a = "yhesocvxduiglberztnwjpfmaq";
		
		
		int i = 0;
		for(char l = 'a'; l <= 'z'; l++)
		{
			map.put(l, a.charAt(i));
			i++;
		}
		map.put('o', 'k');
		
		int n = Integer.parseInt(br.readLine());
		for(i = 1; i <= n; i++)
		{
			String temp = br.readLine();
			pw.print("Case #" + i + ": ");
			for(int j = 0; j < temp.length(); j++)
			{
				if(temp.charAt(j) == ' ') pw.print(" ");
				else pw.print(map.get(temp.charAt(j)));
			}
			pw.println();
		}
		
		pw.close();
		System.exit(0);
	}
}
