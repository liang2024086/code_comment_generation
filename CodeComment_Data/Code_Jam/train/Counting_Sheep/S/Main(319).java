package methodEmbedding.Counting_Sheep.S.LYD625;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
		for (int i = 1; i <= t; ++i) {
			int n = in.nextInt();
			if (n == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			int count = 1;
			int value = 0;
			Set<String> seenDigits = new HashSet<>();

			while (seenDigits.size() < 10) {
				value = n * count;
				for (String digit : String.valueOf(value).split("")) {
					if (digit == null || digit.equals("")) {
						continue;
					}
					seenDigits.add(digit);
				}
				count++;
			}
			System.out.println("Case #" + i + ": " + value);
		}
	}
}
