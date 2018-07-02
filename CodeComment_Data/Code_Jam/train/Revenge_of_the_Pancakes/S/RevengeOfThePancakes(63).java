package methodEmbedding.Revenge_of_the_Pancakes.S.LYD944;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class RevengeOfThePancakes {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("B-small.in"));
		PrintWriter pw = new PrintWriter("B-small.out");
		
		int t = Integer.parseInt(br.readLine());
		
		for (int test = 1; test <= t; test++) {
			String pancake = br.readLine();
			
			boolean[] happy = new boolean[pancake.length()];
			
			for (int i = 0; i < pancake.length(); i++) {
				happy[i] = (pancake.charAt(i) == '+');
			}
			
			int used = 0;
			while (true) {
				int flip = 1;
				
				for (; flip < happy.length && happy[flip] == happy[flip - 1]; flip++);
				if (flip == happy.length && happy[0]) {
					break;
				}
				
				for (int i = 0; i < flip; i++) {
					happy[i] = !happy[i];
				}

				used++;
			}
			
			pw.printf("Case #%d: %d%n", test, used);
		}
		
		br.close();
		pw.close();
	}
}
