package methodEmbedding.Revenge_of_the_Pancakes.S.LYD22;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RevengeOfThePancakes {
	public static void main(String[] args) throws IOException {
		String fileName = "B-small-attempt0";
		Scanner s = new Scanner(new FileInputStream(fileName + ".in"));
		PrintWriter p = new PrintWriter(new File(fileName + ".out"));

		int T = s.nextInt();
		s.nextLine();
		for (int i = 0; i < T; i++) {
			char[] input = s.nextLine().toCharArray();
			int ans = 0;
			
			char curr = input[0];
			for (int j = 0; j < input.length; j++) {
				if (input[j] != curr) {
					ans++;
					curr = input[j];
				}
			}
			
			if (curr == '-')
				ans++;

			p.println("Case #" + (i + 1) + ": " + ans);
		}
		p.close();
		s.close();
	}
}
