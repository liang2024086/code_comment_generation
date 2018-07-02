package methodEmbedding.Cookie_Clicker_Alpha.S.LYD49;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

/**
 * 
 */

/**
 * @author antonio081014
 * @time Apr 11, 2014, 11:45:48 PM
 */
public class GCJ_2014_Qualification_B_Cookie_Clicker_Alpha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("input.txt"));
			PrintWriter out = new PrintWriter(new File("out.txt"));
			int T = Integer.parseInt(in.readLine());
			for (int t = 1; t <= T; t++) {
				String[] s = in.readLine().split("\\s");
				double C = Double.parseDouble(s[0]);
				double F = Double.parseDouble(s[1]);
				double X = Double.parseDouble(s[2]);
				double a = 2.f;
				double time = 0.f;
				while (a < (F * (X - C) / C)) {
					time += C / a;
					a += F;
				}
				time += X / a;
				out.write(String.format("Case #%d: %.7f\n", t, time));
			}
			in.close();
			out.close();
		} catch (Exception e) {
		}
	}
}
