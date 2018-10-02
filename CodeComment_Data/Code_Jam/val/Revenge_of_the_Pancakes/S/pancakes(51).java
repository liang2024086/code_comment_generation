package methodEmbedding.Revenge_of_the_Pancakes.S.LYD599;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class pancakes {
	private static boolean found = false;
	private static int ans = -1;
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(read.readLine());
		for (int i = 0; i < n; i++) {
			String s = read.readLine();
			int moves = 1;
			char current = s.charAt(0);
			int index = 1;
			while (index < s.length()) {
				if (s.charAt(index) != current) {
					moves++;
					current = s.charAt(index);
				}
				index++;
			}
			if (s.charAt(s.length() - 1) == '+') {
				moves--;
			}
			System.out.println("Case #" + (i + 1) + ": " + moves);
		}  
	}
}
