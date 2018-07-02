package methodEmbedding.Counting_Sheep.S.LYD477;

import java.util.*;

public class countingSheep {

	public static void main(String args[]) {
		int limit = 100000;
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		scan.nextLine();
		
		int origList[] = new int[10];
		int list[] = origList;
		int sum = 0;
		
		for (int n = 1; n <= N; n++) {
			int T = scan.nextInt();
			scan.nextLine();
			if (T == 0) {
				System.out.println("Case #" + n + ": INSOMNIA");
				continue;
			}
			
			int a = T;
			if (a < 0) a *= -1;
			char b[] = Integer.toString(a).toCharArray();
			int mult = 0;
			
			while (sum != -10 && mult < limit) {
				mult++;
				if (mult > 1) a = a/(mult-1)*mult;
				b = Integer.toString(a).toCharArray();

				for (int i = 0; i < b.length; i++) {
					list[Character.getNumericValue(b[i])] = -1;
				}
				sum = 0;
				for (int i = 0; i < 10; i++) {
					sum += list[i];
				}
			}
			if (mult == limit) {
				System.out.println("Case #" + n + ": INSOMNIA");
			}
			else {
				System.out.println("Case #" + n + ": " + a);
			}
			list = new int[10]; sum = 0;
		}
	}
}
