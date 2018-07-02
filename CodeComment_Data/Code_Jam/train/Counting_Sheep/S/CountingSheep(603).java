package methodEmbedding.Counting_Sheep.S.LYD1006;

import java.io.File;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountingSheep {

	public static void main(String[] args) {

		Scanner in = null;
		try {
			in = new Scanner(new File(
					"C:\\Users\\kp879\\Desktop\\A-small-attempt0.in"));

			int testCase = Integer.parseInt(in.nextLine());

			Set<Long> allDigitSet = new HashSet<Long>();

			for (int i = 0; i < testCase; i++) {

				allDigitSet.clear();
				
				long val = Long.parseLong(in.nextLine());

				long printVal = 0;

				if (val != 0) {

					for (long j = 1;; j++) {

						long newVal = val * j;

						printVal = val * j;

						while (newVal != 0) {
							allDigitSet.add(newVal % 10);
							newVal /= 10;
						}

						if (allDigitSet.size() == 10)
							break;

					}
					System.out.println("Case #" + (i + 1) + ": " + printVal);
				} else {
					System.out.println("Case #" + (i + 1) + ": INSOMNIA");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
