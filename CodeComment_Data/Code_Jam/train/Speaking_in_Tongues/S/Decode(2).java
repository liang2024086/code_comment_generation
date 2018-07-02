package methodEmbedding.Speaking_in_Tongues.S.LYD857;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Decode
{

	public static void main(String[] args) throws Exception // mad?
	{
		String[][] samples = {
			{"ejp mysljylc kd kxveddknmc re jsicpdrysi", "our language is impossible to understand"},
			{"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", "there are twenty six factorial possibilities"},
			{"de kr kd eoya kw aej tysr re ujdr lkgc jv", "so it is okay if you want to just give up"},
			{"y qeez", "a zooq"}
		};
		
		HashMap<Character, Character> mapping = new HashMap<Character, Character>();
		
		for(String[] in : samples)
		{
			for(int i = 0;i < in[0].length();i++)
			{
				if(in[0].charAt(i) == ' ')
					continue;
				mapping.put(in[0].charAt(i), in[1].charAt(i));
			}
		}
		
		String test = "abcdefghijklmnopqrstuvwxyz";
		for(char c : test.toCharArray())
		{
			if(!mapping.containsKey(c))
				System.out.println("M: " + c);
			if(!mapping.containsValue(c))
				System.out.println("V: " + c);
		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		for(int i = 0;i < count;i++)
		{
			String in = br.readLine();
			char[] out = new char[in.length()];
			
			for(int j = 0;j < in.length();j++)
			{
				Character c = mapping.get(in.charAt(j));
				if(c == null)
					out[j] = in.charAt(j);
				else
					out[j] = c;
			}
			
			System.out.println("Case #" + (i + 1) + ": " + String.valueOf(out));
		}
	}
	
}
