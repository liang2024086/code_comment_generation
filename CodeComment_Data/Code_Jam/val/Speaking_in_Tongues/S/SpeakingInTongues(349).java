package methodEmbedding.Speaking_in_Tongues.S.LYD1065;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

public class SpeakingInTongues
{
	public static void main(String[] args)
	{
		String input = args[0];
		
		try
		{
			FileReader in = new FileReader(input);
			BufferedReader reader = new BufferedReader(in);
			String outName = input.substring(0, input.lastIndexOf('.')) + ".out";
			PrintWriter writer = new PrintWriter(outName);
			Hashtable<Character, Character> mapping = new Hashtable<Character, Character>();
			String googlerese = " ynficwlbkuomxsevzpdrjgthaq";
			String english = 	" abcdefghijklmnopqrstuvwxyz";
			
			for (int i = 0; i < googlerese.length(); i++)
			{
				mapping.put(googlerese.charAt(i), english.charAt(i));
			}
			
			Integer T = Integer.parseInt(reader.readLine());
			
			for (Integer _case = 0; _case < T; _case++)
			{
				String G = reader.readLine();
				StringBuilder S = new StringBuilder();
				
				for (Character c : G.toCharArray())
				{
					S.append(mapping.get(c));
				}
				
				writer.println(String.format("Case #%d: %s", _case + 1, S.toString()));
			}
			
			reader.close();
			writer.close();
		}
		catch (IOException ex)
		{
		}
	}
}
