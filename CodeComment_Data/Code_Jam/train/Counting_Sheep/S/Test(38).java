package methodEmbedding.Counting_Sheep.S.LYD1018;

import java.util.*;
import java.io.*;

public class Test {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs,
								// strings, chars, etc.
		for (int i = 1; i <= t; ++i) {
			// body
			int input = in.nextInt();

			boolean ableToSleep = false;
			int multiplier = 1;
			boolean[] checkArray = new boolean[10];

			if (input == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
			} else {
				while (!ableToSleep) {
					int temp = input;
					int digitCount = 0;

					while (temp > 0) {
						checkArray[temp % 10] = true;
						temp = temp / 10;
					}

					// check if all digits have been shown
					for (int j = 0; j < checkArray.length; j++) {
						digitCount = digitCount + (checkArray[j] ? 1:0);
					}
					
					if (digitCount == 10) {
						ableToSleep = true;
						break;
					}
					//

//					System.out.println("input: " + input + ", digitCount:" + digitCount);
					multiplier++;
					input = input / (multiplier - 1) * multiplier;
				}
				System.out.println("Case #" + i + ": " + input);
			}
		}
		in.close();
	}
}
