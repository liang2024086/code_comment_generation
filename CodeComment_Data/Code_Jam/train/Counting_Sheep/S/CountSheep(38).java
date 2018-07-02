package methodEmbedding.Counting_Sheep.S.LYD567;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountSheep {

	static private final String INPUT = "./A-small-attempt0.in";
	static private final String OUTPUT = "./A-small-attempt0.out";

	// static private final String INPUT = "./A-large.in";
	// static private final String OUTPUT = "./A-large.out";

	public static void main(String args[]) {
		// open I/O files
		FileInputStream instream = null;
		PrintStream outstream = null;

		try {
			instream = new FileInputStream(INPUT);
			outstream = new PrintStream(new FileOutputStream(OUTPUT));
			System.setIn(instream);
			System.setOut(outstream);
		} catch (Exception e) {
			System.err.println("Error Occurred.");
			e.printStackTrace();
			return;
		}

		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int N;
		long num;
		long ans;

		for (int t = 1; t <= T; ++t) {
			N = in.nextInt();

			if (N == 0) {
				System.out.println("Case #" + t + ": INSOMNIA");
				continue;
			}

			long i = 1;
			Set<Integer> s = new HashSet<Integer>();

			while (true) {
				num = N * i++;
				ans = num;

				while (num > 0) {
					s.add((int) num % 10);
					num /= 10;
				}

				if (s.size() > 9)
					break;
			}

			System.out.println("Case #" + t + ": " + ans);
		}

		in.close();
		return;
	}

}
