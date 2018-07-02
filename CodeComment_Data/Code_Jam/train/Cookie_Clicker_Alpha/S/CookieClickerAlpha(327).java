package methodEmbedding.Cookie_Clicker_Alpha.S.LYD285;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class CookieClickerAlpha {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(
				"infile/B-small-attempt0.in"));
		FileWriter fw = new FileWriter("infile/B-small-attempt0.out");

		int T = new Integer(in.readLine());
		for (int cases = 1; cases <= T; cases++) {

		//	System.out.println("In TestCase " + cases);
			String row = in.readLine();
			// System.out.println("In row "+row);
			String tokens[] = row.split(" ");
			Double C = Double.valueOf(tokens[0]);
			Double F = Double.valueOf(tokens[1]);
			Double X = Double.valueOf(tokens[2]);
			// System.out.println("C="+C+" F="+F+" X="+X);
			Double time = new Double(0);
			Double time1 = new Double(0);
			Double wait = new Double(0);
			Double f = new Double(2);
			Double result = new Double(X / f);
			// System.out.println("t="+time +"best="+ bestTime);

			time = X / f;
			while (time >= result) {
				time = result;

				wait = wait + C / f;
				f = f + F;
				time1 = X / f;

				result = wait + time1;

			}

			//System.out.println("Case #" + cases + ": " + time + "\n");
			fw.write("Case #" + cases + ": " + time + "\n");

		}

		in.close();

		fw.flush();
		fw.close();
	}

}
