package methodEmbedding.Counting_Sheep.S.LYD1379;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(new FileReader("input.in"));
			PrintWriter writer = new PrintWriter("Output.txt");

			int T = scan.nextInt();

			HashSet<Integer> digits;

			for (int i = 0; i < T; i++) {

				writer.print("Case #" + (i + 1) + ": ");

				digits = new HashSet<Integer>();
				long N = scan.nextLong();

				if (N == 0)
					writer.println("INSOMNIA");

				else {
					int j = 1;
					long num = 0;
					while (digits.size() < 10) {
						long n = N * j++;
						num = n;
						while (n > 0) {
							digits.add((int) (n % 10));
							n = n / 10;
						}
					}

					writer.println(num);
				}

			}
			writer.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
