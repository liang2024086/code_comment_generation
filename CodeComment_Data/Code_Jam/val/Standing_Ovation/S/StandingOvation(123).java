package methodEmbedding.Standing_Ovation.S.LYD1963;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class StandingOvation {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("A-small-attempt2.in")));
		PrintStream out = new PrintStream(new FileOutputStream("output.out"));
		System.setOut(out);
		int tests = Integer.parseInt(br.readLine());
		for (int i = 1; i <= tests; i++) {
			int total = 0;
			int result = 0;
			String[] S = br.readLine().split(" ");
			String num = S[1];
			for (int j = 0; j < num.length(); j++) {
				int digit = num.charAt(j) - '0';
				if (total < j){
					int newFriends = j - total;
					total += newFriends;
					result += newFriends;
				}
				total += digit;
			}
			out.println("Case #" + i + ": " + result);
		}
		br.close();
	}
}
