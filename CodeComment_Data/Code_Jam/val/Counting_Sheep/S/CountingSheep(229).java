package methodEmbedding.Counting_Sheep.S.LYD1479;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountingSheep {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("A-small.in"));
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			int n = Integer.parseInt(br.readLine());

			boolean[] seen = new boolean[10];
			int s = 0;
			
			if (n == 0) {
				System.out.printf("Case #%d: INSOMNIA%n", test);
			} else {
				int current = n;
				while (s < 10) {
					int q = current;
					while (q != 0) {
						int p = q % 10;
						if (!seen[p]) {
							seen[p] = true;
							s++;
						}
						q /= 10;
					}
					current += n;
				}
				
				System.out.printf("Case #%d: %d%n", test, current - n);
			}
		}
	}
}
