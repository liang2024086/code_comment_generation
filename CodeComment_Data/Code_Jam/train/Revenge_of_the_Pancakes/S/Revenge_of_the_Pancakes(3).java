package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1050;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class Revenge_of_the_Pancakes {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(
				"/Users/SISQUAKE/workspace/code_jam/input/B-small-attempt0.in");

		BufferedReader br = new BufferedReader(fr);
		int n;

		n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			int[] cake = new int[str.length()];
			char cur = 'y';
			int time = 0;
			for (int j = 0; j < str.length(); j++) {
				if (cur != str.charAt(j)) {
					cur = str.charAt(j);
					time++;
				}

				// System.out.print());
			}
			if (cur == '+')
				time--;
			System.out.println("Case #" + i + ": " + time);

		}
		fr.close();

	}
}
