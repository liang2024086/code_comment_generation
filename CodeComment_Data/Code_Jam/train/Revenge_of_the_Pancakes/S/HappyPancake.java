package methodEmbedding.Revenge_of_the_Pancakes.S.LYD689;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class HappyPancake {

	public static void main(String... strings) {

		Scanner sc = new Scanner(System.in);
		PrintStream ps = System.out;
		try {
			System.setOut(new PrintStream(new FileOutputStream("outB.txt")));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ps.close();
		int numCases = Integer.valueOf(sc.nextLine());

		for (int i = 0; i < numCases; i++) {
			String s = sc.nextLine();
			int flips = 0, zero = 0;
			while (s.charAt(zero) == '-' && zero < s.length()) {
				flips = 1;
				if (zero < s.length() - 1)
					zero++;
				else break;
			}

			char curr, previous = '-';
			for (int j = zero; j < s.length(); j++) {
				curr = s.charAt(j);
				if (curr == previous) {
				} else if (curr == '-' && previous == '+') {
					flips += 2;
				}
				previous = curr;
			}
			System.out.printf("Case #%d: %d\n", i + 1, flips);
		}
		sc.close();
	}
}
