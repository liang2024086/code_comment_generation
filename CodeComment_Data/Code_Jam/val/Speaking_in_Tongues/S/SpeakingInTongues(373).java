package methodEmbedding.Speaking_in_Tongues.S.LYD121;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class SpeakingInTongues {

	static Map m = new HashMap();
	static {
		m.put(" ", " ");
		m.put("a", "y");
		m.put("b", "h");
		m.put("c", "e");
		m.put("d", "s");
		m.put("e", "o");
		m.put("f", "c");
		m.put("g", "v");
		m.put("h", "x");
		m.put("i", "d");
		m.put("j", "u");
		m.put("k", "i");
		m.put("l", "g");
		m.put("m", "l");
		m.put("n", "b");
		m.put("o", "k");
		m.put("p", "r");
		m.put("q", "z"); // q or z
		m.put("r", "t");
		m.put("s", "n");
		m.put("t", "w");
		m.put("u", "j");
		m.put("v", "p");
		m.put("w", "f");
		m.put("x", "m");
		m.put("y", "a");
		m.put("z", "q"); // z or q
	}
	
	public static void main(String[] args) throws Exception
	{
		File input = new File("a.txt");
		FileReader fr = new FileReader(input);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		line = br.readLine();
		int count = Integer.parseInt(line);
		char[] chars;
		for(int i = 0; i < count; i++)
		{
			line = br.readLine();
			chars = line.toCharArray();
			System.out.print("Case #" + (i + 1) + ": ");
			for(char c : chars)
				System.out.print(m.get(String.valueOf(c)));
			System.out.println();
		}
	}
}
