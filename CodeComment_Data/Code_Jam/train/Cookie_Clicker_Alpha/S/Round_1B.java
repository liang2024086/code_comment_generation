package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1573;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Round_1B {
	public static void main(String args[]) throws IOException {
		// Read input file
		FileReader fr = new FileReader("B-small-attempt1.in");
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		// Variable Declaration
		int t, tt;
		double c, f, x, time, cur;
		String s[] = new String[3];
		// Program starts here
		while ((line = br.readLine()) != null) {
			t = Integer.parseInt(line);
			for (tt = 1; tt <= t; tt++) {
				// Prepare output
				String out = "Case #" + tt + ": ";
				// Individual case execution
				line = br.readLine();
				s = line.split(" ");
				// c = Float.parseFloat(s[0]);
				// f = Float.parseFloat(s[1]);
				// x = Float.parseFloat(s[2]);

				c = Double.parseDouble(s[0]);
				f = Double.parseDouble(s[1]);
				x = Double.parseDouble(s[2]);

				time = 0.0f;
				cur = 2.0f;
				while ((time + (x / (cur))) > (time + (c / cur) + (x / (cur + f)))) {
					time += c / cur;
					cur += f;
				}
				time += x / cur;
				System.out.println(out + time);
			}
		}
		br.close();
	}
}
