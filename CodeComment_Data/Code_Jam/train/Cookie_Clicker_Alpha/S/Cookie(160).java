package methodEmbedding.Cookie_Clicker_Alpha.S.LYD901;

import java.io.*;
import java.util.*;
import java.text.*;
public class Cookie {
	public static void main(String[] args) throws IOException {
		FileWriter f = new FileWriter(new File("Solutions2.txt"));
		Scanner in = null;
		try {
			in = new Scanner(new File(args[0]));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		int T = in.nextInt();
		for (int i = 1; i <= T; i++) {
			double sec = 0;
			double rate = 2.0;
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			boolean Continue = true;
			while (Continue) {
				double timeToC = C/rate;
				double timeTogoal = X/rate;
				double t = timeToC + X/(rate + F);
				if (t < timeTogoal) {
					rate+=F;
					sec += timeToC;
				}
				else {
					sec += timeTogoal;
					Continue = false;
				}
			}
			DecimalFormat df = new DecimalFormat("#.0000000");
			String s = "Case #" + i + ": " + df.format(sec) + "\n";
			f.write(s);
		}
		f.close();
	}
}
