package methodEmbedding.Cookie_Clicker_Alpha.S.LYD456;

/**
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/**
 * @author festradasolano
 *
 */
public class CookieClickerAlpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter out = null;

		// SMALL
		String fileIn = "files/B-small.txt"; // input file
		String fileOut = "files/B-small-output.txt"; // output file

		String input = "";
		try {
			fr = new FileReader(fileIn);
			br = new BufferedReader(fr);
			String s;
			while ((s = br.readLine()) != null)
				input += s + "\n";
			br.close();

			fw = new FileWriter(fileOut);
			bw = new BufferedWriter(fw);
			out = new PrintWriter(bw);
		} catch (Exception e) {
			e.printStackTrace();
		}

		int nCases = Integer.parseInt(input.substring(0, input.indexOf("\n"))
				.trim());
		int line = input.indexOf("\n", 0) + 1;

		for (int i = 0; i < nCases; i++) {
			System.out.println("Case #" + (i+1));
			
			double c = Double.parseDouble(input.substring(line, input.indexOf(" ", line)));
			line = input.indexOf(" ", line) + 1;
			
			double f = Double.parseDouble(input.substring(line, input.indexOf(" ", line)));
			line = input.indexOf(" ", line) + 1;
			
			double x = Double.parseDouble(input.substring(line, input.indexOf("\n", line)));
			line = input.indexOf("\n", line) + 1;
			
			long farmsToBuild = 0;
			double minimumTime = 0;
			while (true) {
				double initialRate = 2.0;
				double time = x / (initialRate + (farmsToBuild * f));
				for (long j = 0; j < farmsToBuild; j++) {
					time = time + (c / (initialRate + (j * f)));
				}
				
				if (minimumTime == 0) {
					minimumTime = time;
				} else if (time < minimumTime) {
					minimumTime = time;
				} else if (time > minimumTime) {
					break;
				}
				
				farmsToBuild++;
			}
			
			DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.US);
			DecimalFormat df = new DecimalFormat("#.0000000", dfs);
			
			String output = "Case #" + (i + 1) + ": " + df.format(minimumTime);
			out.println(output);
			out.flush();
		}
		out.close();
		System.out.println("PROCESS COMPLETE!!");
	}

}
