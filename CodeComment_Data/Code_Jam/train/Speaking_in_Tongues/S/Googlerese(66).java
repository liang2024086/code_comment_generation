package methodEmbedding.Speaking_in_Tongues.S.LYD1513;



import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;

public class Googlerese {
	public static void main (String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		Writer out = null;

		HashMap<String, String> googleMap = new HashMap<String, String>();
		googleMap.put("a", "y");
		googleMap.put("b", "h");
		googleMap.put("c", "e");
		googleMap.put("d", "s");
		googleMap.put("e", "o");
		googleMap.put("f", "c");
		googleMap.put("g", "v");
		googleMap.put("h", "x");
		googleMap.put("i", "d");
		googleMap.put("j", "u");
		googleMap.put("k", "i");
		googleMap.put("l", "g");
		googleMap.put("m", "l");
		googleMap.put("n", "b");
		googleMap.put("o", "k");
		googleMap.put("p", "r");
		googleMap.put("q", "z");
		googleMap.put("r", "t");
		googleMap.put("s", "n");
		googleMap.put("t", "w");
		googleMap.put("u", "j");
		googleMap.put("v", "p");
		googleMap.put("w", "f");
		googleMap.put("x", "m");
		googleMap.put("y", "a");
		googleMap.put("z", "q");
		googleMap.put(" ", " ");

		try {
			fr = new FileReader(args[0]);
			br = new BufferedReader(fr);
			out = new OutputStreamWriter(new FileOutputStream("googlerese-result.txt"));
//			out = new OutputStreamWriter(new FileOutputStream("/home/abuazzam/Dev/workspace/1rstwap/codejam/bin/googlerese-result.txt"));
			String numOfLine = br.readLine();
			int line = 0;
			if (numOfLine != null) {
				line = Integer.valueOf(numOfLine);
			} else {
				return;
			}

			String lineData;

			for (int i = 1; i <= line; i++) {
				String convertedLine = "";
				lineData = br.readLine();

				for (int j = 0; j < lineData.length(); j++) {
					convertedLine += googleMap.get(String.valueOf(lineData.charAt(j)));
				}
				convertedLine = "Case #" + i + ": " + convertedLine.trim();
				out.write(convertedLine);
				if (i != line) {
					out.write("\n");
				}
//				System.out.println(convertedLine);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
				out.close();
			} catch(Exception e) {}
		}
	}
}
