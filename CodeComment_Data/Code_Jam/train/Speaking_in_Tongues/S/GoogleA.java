package methodEmbedding.Speaking_in_Tongues.S.LYD673;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class GoogleA {


	public static void main(String[] args) {
		try {
			HashMap<String, String> translator = new HashMap<String, String>();
			translator.put("y", "a");
			translator.put("n", "b");
			translator.put("f", "c");
			translator.put("i", "d");
			translator.put("c", "e");
			translator.put("w", "f");
			translator.put("l", "g");
			translator.put("b", "h");
			translator.put("k", "i");
			translator.put("u", "j");
			translator.put("o", "k");
			translator.put("m", "l");
			translator.put("x", "m");
			translator.put("s", "n");
			translator.put("e", "o");
			translator.put("v", "p");
			translator.put("z", "q");
			translator.put("p", "r");
			translator.put("d", "s");
			translator.put("r", "t");
			translator.put("j", "u");
			translator.put("g", "v");
			translator.put("t", "w");
			translator.put("h", "x");
			translator.put("a", "y");
			translator.put("q", "z");
			translator.put(" ", " ");
			
			BufferedReader reader = new BufferedReader(new FileReader("/google/A-small-attempt1.in"));
			String strLine;
			//Read File Line By Line
			int ctr = 0;
			StringBuffer output;
			while ((strLine = reader.readLine()) != null)   {
				if (ctr>0) {
					output = new StringBuffer("Case #" + ctr + ": ");
					for (char c:strLine.toCharArray()) {
						output.append(translator.get(String.valueOf(c)));
					}
					System.out.println(output);
				}
				ctr++;
			}
			reader.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	
}
