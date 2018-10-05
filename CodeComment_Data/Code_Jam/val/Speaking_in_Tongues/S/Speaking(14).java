package methodEmbedding.Speaking_in_Tongues.S.LYD435;

import java.io.*;
import java.util.*;

public class Speaking
{
	public static void main(String[] codejam) throws Exception
	{
		BufferedReader br = new BufferedReader (new FileReader ("speaking.in"));
		PrintStream ps = new PrintStream (new FileOutputStream ("speaking.out"));
		Map<String, String> map = new TreeMap<String, String>();
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String key = "yhesocvxduiglbkrztnwjpfmaq";
		for(int i=0;i<alpha.length();i++)
			map.put(alpha.substring(i, i+1), key.substring(i, i+1));
		map.put(" ", " ");
		int t = Integer.parseInt(br.readLine());
		for(int l=1;l<=t;l++)
		{
			String sent = br.readLine();
			String end = "";
			for(int i=0;i<sent.length();i++)
				end += map.get(sent.substring(i, i+1));
			ps.println("Case #" + l + ": " + end);
		}
	}
}
