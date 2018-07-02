package methodEmbedding.Counting_Sheep.S.LYD1608;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i = 0; i < t; ++i) {
			int n = s.nextInt();
			int multiplier = 1;
			// Hoping that only 0 is a breaking case
			// can't think of why any other number would be unreachable
			if(n == 0) System.out.printf("Case #%d: INSOMNIA\n", i + 1);
			else {
				HashSet<Integer> setOfDigits = new HashSet<Integer>();
				while(setOfDigits.size() != 10) {
					int current = n*multiplier;

					while(current != 0) {
						setOfDigits.add(current%10);
						current = current / 10;
					}

					multiplier += 1;
				}
				System.out.printf("Case #%d: %d\n", i + 1, n*(multiplier-1));
			}
		}
	}

}
