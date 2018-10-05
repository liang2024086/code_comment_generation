package methodEmbedding.Revenge_of_the_Pancakes.S.LYD218;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main();
	}

	public Main() throws FileNotFoundException {
		//Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
		PrintWriter out = new PrintWriter(new File("B_small.out"));

		int T = sc.nextInt();
		for (int t = 1; t <= T; t++) {
			int sol = 0;
			String s = sc.next();
			char last = s.charAt(0);
			for (int i = 1; i < s.length(); i++) {
				if (s.charAt(i) != last) {
					sol++;
					last = s.charAt(i);
				}
			}
			if (s.charAt(s.length()-1) == '-') sol++;
			System.out.println("Case #" + t + ": " + sol);
			out.println("Case #" + t + ": " + sol);
		}

		out.close();
		sc.close();
	}
}
