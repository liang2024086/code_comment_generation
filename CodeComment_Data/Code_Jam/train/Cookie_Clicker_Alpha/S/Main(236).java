package methodEmbedding.Cookie_Clicker_Alpha.S.LYD644;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		File input = null;
		for (File f : new File(".").listFiles()) {
			if (f.isFile() && f.getName().endsWith(".in")) {
				input = f;
				break;
			}
		}
		Scanner s = new Scanner(input);
		BufferedWriter w = new BufferedWriter(new FileWriter(new File("output")));
		int cases = s.nextInt();
		s.nextLine();

		for (int i = 0; i < cases; i++) {
			w.write("Case #");
			w.write(String.valueOf(i + 1));
			w.write(": ");

			double c = s.nextDouble();
			double f = s.nextDouble();
			double x = s.nextDouble();

			int farm = 0;

			double baseTime = 0;
			double ans = x/(2 + farm * f);

			for (;;) {
				double forNext = c /(2 + farm * f);
				farm++;
				double newTime = baseTime + forNext + x/(2 + farm * f);
				if (newTime > ans) {
					break;
				} else {
					baseTime += forNext;
					ans = newTime;
				}
			}

			w.write(String.format("%.7f", ans));
			w.write("\n");
		}
		w.close();
	}

}
