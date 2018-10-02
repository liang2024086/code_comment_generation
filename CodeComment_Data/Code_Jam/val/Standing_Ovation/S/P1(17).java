package methodEmbedding.Standing_Ovation.S.LYD1530;

import java.io.File;
import java.util.Scanner;

public class P1 {
	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("A-small-attempt0.in"));
		int T = scanner.nextInt();
		for (int i=0; i<T; i++) {
			int Sm = scanner.nextInt();
			int r = 0, g = 0;
			String m = scanner.next();
			for (int j=0; j<Sm+1; j++) {
				int x = ((int) m.charAt(j)) - 48;
				if ((g+r) < j) r += (j - (g+r));
				g += x;
			}
			System.out.println("Case #" + (i+1) + ": " + r);
		}
		scanner.close();
	}
}
