package methodEmbedding.Standing_Ovation.S.LYD953;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("a.txt"));
		int t = sc.nextInt();
		for (int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			String lol = sc.next();
			int c = 0;
			int add = 0;
			for (int i = 0; i <= n; i++) {
				int lawl = (int) (lol.charAt(i) - '0');
				if (c >= i) {
					
				} else {
					int needed = i - c;
					add += needed;
					c = i;
				}
				c += lawl;
//				System.out.println("lal " + lawl);
			}
			System.out.println("Case #" + tc + ": " + add);
		}
	}
}
