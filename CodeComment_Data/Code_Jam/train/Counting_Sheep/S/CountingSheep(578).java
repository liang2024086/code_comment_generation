package methodEmbedding.Counting_Sheep.S.LYD1160;

import java.io.*;
import java.util.*;
import java.math.*;
import java.util.regex.*;
import java.text.*;

class CountingSheep {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("A-small.in"));

		int cases = scanner.nextInt();

		int n, curr_num, digit;
		String s;
		HashMap hmap = new HashMap();

		// Iterate over test cases
		for (int i = 0; i < cases; i++) {
			n = scanner.nextInt();

			if (n == 0) {
				System.out.printf("Case #%d: INSOMNIA\n", n + 1);
				continue;
			}

			// Build HashMap with all digits not seen yet
		    for (int h = 0; h < 10; h++) { hmap.put(h, 0); }

			for (int j = 1; ; j++) {
				curr_num = j*n;
				s = Integer.toString(curr_num);

				// Add individual digits to hmap, flip val to 1 for that digit
				for (int k = 0; k < s.length(); k++) {
					digit = Character.getNumericValue(s.charAt(k));
					hmap.put(digit, 1);
				}

				// If we've seen all digits, print solution and break
				if (!hmap.containsValue(0)) {
					System.out.printf("Case #%d: %d\n", i + 1, curr_num);
					break;
				}
			}

			hmap.clear();

		}
	}
}
