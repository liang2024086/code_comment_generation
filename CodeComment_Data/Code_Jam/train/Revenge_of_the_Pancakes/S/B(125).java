package methodEmbedding.Revenge_of_the_Pancakes.S.LYD192;


import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		in.nextLine();
		
		int count = 1;
		for (int i = 0; i < T; i++) {
			char[] pancakes = in.nextLine().toCharArray();
			int flips = 0;
			char old = pancakes[0];
			for (int j = 1; j < pancakes.length; j++) {
				char ch = pancakes[j];
				if (ch != old) {
					flips++;
					old = ch;
				}
			}
			
			if (old == '-') {
				flips++;
			}
			
			System.out.printf("Case #%d: %d%n", count++, flips);
		}
		
		in.close();
	}
}
