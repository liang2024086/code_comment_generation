package methodEmbedding.Counting_Sheep.S.LYD1059;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;

public class SheepCounting {
	public static void main(String[] args) throws IOException {
		HashSet<BigInteger> storage = new HashSet<BigInteger>();
		BigInteger n, copy;

		String input = "C:\\Users\\david_000\\downloads\\input.in";
		String output = "C:\\Users\\david_000\\downloads\\output.txt";

		PrintWriter printer = new PrintWriter(new File(output));
		Scanner sc = new Scanner(new File(input));

		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {

			n = sc.nextBigInteger();
			copy = n;

			if (n.compareTo(BigInteger.ZERO) != 0) {
				int term = 0;

				while (storage.size() < 10) {
					term++;
					copy = n.multiply(BigInteger.valueOf(term));

					while (copy.compareTo(BigInteger.ZERO) == 1) {
						storage.add(copy.mod(BigInteger.valueOf(10)));
						copy = copy.divide(BigInteger.valueOf(10));
					}
				}

				storage.clear();

				printer.println("Case #" + i + ": " + n.multiply(BigInteger.valueOf(term)));

			} else
				printer.println("Case #" + i + ": INSOMNIA");
		}

		sc.close();
		printer.close();
	}
}
