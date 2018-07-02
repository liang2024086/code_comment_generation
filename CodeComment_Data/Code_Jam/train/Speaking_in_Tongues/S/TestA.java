package methodEmbedding.Speaking_in_Tongues.S.LYD868;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, String> g = new HashMap<String, String>();

		g.put(" ", " ");

		g.put("q", "z");

		g.put("d", "s");
		g.put("r", "t");
		g.put("j", "u");
		g.put("g", "v");
		g.put("t", "w");
		g.put("h", "x");
		g.put("a", "y");

		g.put("y", "a");
		g.put("n", "b");
		g.put("f", "c");
		g.put("i", "d");
		g.put("c", "e");
		g.put("w", "f");
		g.put("l", "g");
		g.put("b", "h");
		g.put("k", "i");
		g.put("u", "j");
		g.put("o", "k");
		g.put("m", "l");
		g.put("x", "m");
		g.put("s", "n");
		g.put("e", "o");
		g.put("v", "p");
		g.put("z", "q");
		g.put("p", "r");
		try {
			String filein = "testA.in";
			String fileout = "testA.out";

			String currentdir = System.getProperty("user.dir");

			Scanner scanner = new Scanner(new File(currentdir + "/" + filein));
			FileWriter fWriter = new FileWriter(new File(currentdir + "/" + fileout));
			String line = "", resultat = "";

			int i = 0;

			while (scanner.hasNextLine()) {
				line = scanner.nextLine();
				if (i == 0) {
					Integer iNumber = 0;
					try {
						iNumber = Integer.valueOf(line);
					} catch (Exception ex) {
						resultat = " NaN !!!!";
						break;
					}
					if (iNumber <= 0 || iNumber > 30) {
						resultat = " Error: More than 30 !!!!";
						break;
					}
					i++;
					continue;
				}
				resultat = "Case #" + i + ": ";
				for (int j = 0; j < line.length(); j++) {
					char ch = line.charAt(j);
					resultat += g.get("" + ch);
				}

				fWriter.append(resultat + "\r\n");

				i++;
			}
			scanner.close();
			fWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
