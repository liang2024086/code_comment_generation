package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1197;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream(new File("small_b.in")));
		System.setOut(new PrintStream(new File("small_b.out")));
		Scanner S = new Scanner(System.in);
		int T = S.nextInt();
		for (int i = 1; i <= T; i++) {
			String stack = S.next() + "+";
			int switches = 0;
			char curr = stack.charAt(0);
			for (int j = 1; j < stack.length(); j++) {
				if (stack.charAt(j) != curr) {
					switches++;
				}
				curr = stack.charAt(j);
			}
			System.out.println(String.format("Case #%s: %s", i, switches));
		}
	}
}
