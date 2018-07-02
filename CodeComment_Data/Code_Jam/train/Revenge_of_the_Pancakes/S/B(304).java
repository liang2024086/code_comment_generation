package methodEmbedding.Revenge_of_the_Pancakes.S.LYD886;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int caze = 1; caze <= T; caze++) {
			char[] word = br.readLine().toCharArray();
			int groups = 0;
			char last = ' ';
			for (int i = word.length - 1; i >= 0; i--) {
				if (word[i] != last) {
					groups++;
					last = word[i];
				}
			}
			if (word[word.length - 1] == '+') {
				groups--;
			}
			System.out.println(String.format("Case #%d: %d", caze, groups));
		}
	}
}
