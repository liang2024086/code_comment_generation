package methodEmbedding.Speaking_in_Tongues.S.LYD924;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class A
{
	public static void main(String[] args) throws Exception
	{
		Map<Character, Character> map = new HashMap<Character, Character>();
		{
			// train
			BufferedReader in = new BufferedReader(new FileReader("QR2012/A/train.in"));
			final int T = Integer.parseInt(in.readLine());

			for (int t = 1; t <= T; t++)
			{
				String enc = in.readLine();
				String dec = in.readLine();
				for (int i = 0; i < enc.length(); i++)
				{
					char e = enc.charAt(i);
					char d = dec.charAt(i);
					if(map.get(e) != null && !map.get(e).equals(d))
						System.out.println(e + " being remapped to " + d + " from " + map.get(e));
					if(e != ' ')
					map.put(e, d);
				}
			}
			map.put('y', 'a');
			map.put('e', 'o');
			map.put('q', 'z');
			map.put('z', 'q');
			map.put(' ', ' ');
		}
		System.out.println("MAP: " + map.size());
		{
			// do it
			String test = "A-small-attempt4";
			BufferedReader in = new BufferedReader(new FileReader("QR2012/A/" + test + ".in"));
			PrintWriter out = new PrintWriter("QR2012/A/" + test + ".out." + System.currentTimeMillis());

			final int T = Integer.parseInt(in.readLine());

			for (int t = 1; t <= T; t++)
			{
				String enc = in.readLine();
				StringBuilder dec = new StringBuilder();
				for (char c : enc.toCharArray())
					dec.append(map.get(c));
				System.out.println("Case #" + t + ": " + dec);
				out.println("Case #" + t + ": " + dec);
			}
			out.close();
		}
	}

}
