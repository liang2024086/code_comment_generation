package methodEmbedding.Counting_Sheep.S.LYD850;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Prob1 {

	public static void main(String[] args) {
		Set<Integer> b = new HashSet<Integer>();

		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(
				System.in)));
		int t = in.nextInt();

		//System.out.print(t + "\t");

		for (int x = 1; x <= t; ++x) {
			b.addAll(Arrays
					.asList(new Integer[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }));

			int num = in.nextInt();
			int temp, y = 0, i = 1;

			if (num == 0) {
				System.out.println("Case #" + x + ": INSOMNIA");
			//	System.out.print("\n" + num + "\t");
			} else {
				while (!b.isEmpty()) {
					y = num * i;
					String number = String.valueOf(y);
					char[] digits1 = number.toCharArray();
					for (Character dgt : digits1) {
						temp = Character.getNumericValue(dgt);
						if (b.contains(temp)) {
							b.remove(temp);
						}
					}
					if (b.isEmpty()) {
						System.out.println("Case #" + x + ": " + y);
				//		System.out.print("\n" + num + "\t");
					}
					++i;
				}

			}

		}
	}

}
