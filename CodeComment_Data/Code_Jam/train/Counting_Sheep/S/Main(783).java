package methodEmbedding.Counting_Sheep.S.LYD100;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String args[]) {

		Locale.setDefault(Locale.US);

		Scanner in;
		try {
			in = new Scanner(new File("input.txt"));
		} catch (Exception e) {
			in = new Scanner(System.in);
		}

		PrintWriter out;
		try {
			out = new PrintWriter("output.txt");
		} catch (Exception e) {
			out = new PrintWriter(System.out);
		}

		int t = in.nextInt();

		for (int i = 0; i < t; ++i) {

			String res = "Case #" + (i + 1) + ": ";

			long n = in.nextInt();

			if (n == 0) {
				res += "INSOMNIA";
			}
			else {

				List<Integer> digits = new ArrayList<>();
					
				long c = n;

				while (digits.size() < 10) {
					long x = c;
					while (x > 0) {
						int d = (int) x % 10;
						if (!digits.contains(d)) {
							digits.add(d);
						}
						x /= 10;
					}
					c += n;
				}

				res += c - n;
			}

			System.out.println(res);
			out.println(res);
		}

		out.close();
	}
}
