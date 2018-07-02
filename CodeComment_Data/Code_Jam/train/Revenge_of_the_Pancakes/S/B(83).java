package methodEmbedding.Revenge_of_the_Pancakes.S.LYD172;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class B {

	public static void main(final String[] args) throws IOException {
		final Scanner sc = new Scanner(new FileReader("Bin.in"));
		final BufferedWriter w = new BufferedWriter(new FileWriter("Bout.txt"));

		if (sc.hasNextInt()) {
			final int testNumber = sc.nextInt();
			for (int i = 1; i <= testNumber; i++) {
				final String in = sc.next();
				int result = 0;
				char current = '+';

				for (int j = in.length()-1; j >-1; j--) {
					final char s = in.charAt(j);
					if (current != s) {
						result++;
						current = s;
					}
				}
				w.write("Case #"+i+": "+result+"\n");
				System.out.println("Case #"+i+": "+result);
			}
		}
		sc.close();
		w.flush();
		w.close();
	}

}
