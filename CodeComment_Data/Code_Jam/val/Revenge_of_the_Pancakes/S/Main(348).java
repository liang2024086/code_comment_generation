package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1111;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader("B-small-attempt0.in.txt"));
		int n = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= n; ++i) {
			char[] pancakes = reader.readLine().toCharArray();
			int res = 0;
			for (int j = pancakes.length - 1; j >= 0; --j) {
				if (pancakes[j] == '-') {
					for (int k = 0; k <= j; ++k) {
						pancakes[k] = (pancakes[k] == '-' ? '+' : '-');
					}
					
					res++;
				}
			}
			System.out.println("Case #" + i + ": " + res); 
		}

	}

}
