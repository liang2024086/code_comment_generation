package methodEmbedding.Cookie_Clicker_Alpha.S.LYD13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class QualB {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		System.setIn(new FileInputStream(new File("input.in")));
		System.setOut(new PrintStream(new File("output.txt")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(in.readLine());
		for (int test = 1; test <= t; test++) {
			System.out.print("Case #" + test + ": ");
			String[] p = in.readLine().split(" ");
			double c = Double.parseDouble(p[0]);
			double f = Double.parseDouble(p[1]);
			double x = Double.parseDouble(p[2]);
			double res = 0;
			double current = 2;
			while (true) {
				if (x / current <= ((c / current) + (x / (current + f)))) {
					res += x / current;
					break;
				}
				res += c / current;
				current += f;
			}
			System.out.println(res);

		}
	}
}
