package methodEmbedding.Standing_Ovation.S.LYD2159;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	private static final String IN_FILE_PATH = "D:\\projects\\codejam\\A-small-attempt1.in";
	private static final String OUT_FILE_PATH = "D:\\projects\\codejam\\out.txt";

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream(new File(IN_FILE_PATH)));
		PrintWriter writer = new PrintWriter(new File(OUT_FILE_PATH));

		int tests = Integer.valueOf(scanner.nextLine());
		int ans;
		for (int test = 1; test <= tests; test++) {
			ans = 0;
			int k = 0;
			int n = scanner.nextInt();
			String s = scanner.next();

			for (int i = 0; i <= n; i++) {
				int m = s.charAt(i) - '0';
				if (m == 0) continue;
				int diff = i - k;
				if (diff > 0) {
					ans += diff;
					k+= diff;
				}
				k += m;
			}

			writer.println("Case #" + test + ": " + ans);
		}

		writer.close();
		scanner.close();
	}
}
