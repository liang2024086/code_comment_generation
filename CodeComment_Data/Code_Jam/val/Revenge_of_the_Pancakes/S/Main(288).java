package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1176;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int tests = s.nextInt();
		for(int t = 0; t < tests; ++t) {
			int numChanges = 0;
			String input = s.next();

			boolean afterPlus = false;
			int pointer = 0;
			while(pointer < input.length()) {
				if(input.charAt(pointer) == '-') {
					while(pointer < input.length() && input.charAt(pointer) == '-')
						pointer ++;
					numChanges = afterPlus ? numChanges + 2 : numChanges + 1;
				}
				if(pointer < input.length() && input.charAt(pointer) == '+') afterPlus = true;
				pointer ++;
			}

			System.out.printf("Case #%d: %d\n", t + 1, numChanges);
		}
	}

}
