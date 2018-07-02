package methodEmbedding.Revenge_of_the_Pancakes.S.LYD98;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class B {
	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("test/B-small-attempt0.in"));
		System.setOut(new PrintStream("test/B-small-attempt0.out"));
		Scanner in = new Scanner(System.in);
		int n0 = Integer.parseInt(in.nextLine());
		for (int i0 = 1; i0 <= n0; i0++) {
			char[] c = in.nextLine().toCharArray();
			int sum = 0;
			boolean f = true;
			for (int i = c.length - 1; i >= 0; i--) {
				if (f && c[i] == '-') {
					f = !f;
					sum++;
				} else if(!f && c[i] == '+') {
					f = !f;
					sum++;
				}
			}
			
			System.out.println("Case #" + i0 + ": " + sum);
		}
		in.close();
	}
}
