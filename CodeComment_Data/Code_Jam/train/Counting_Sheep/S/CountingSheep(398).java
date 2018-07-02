package methodEmbedding.Counting_Sheep.S.LYD1353;

import java.io.*;
import java.util.*;

public class CountingSheep {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		PrintWriter pw = new PrintWriter(new FileWriter("output.txt"));

		int numOfCase = sc.nextInt();

		for (int i = 0; i < numOfCase; i++) {
			int base = sc.nextInt();
			if (base == 0) {
				pw.println("Case #" + (i + 1) + ": INSOMNIA");
				continue;
			}

			int digitCount = 0, number = base;
			int[] digitFlag = new int[10];
			
			for (; digitCount < 10; number += base) {
				int count = number;

				do {
					int digit = count % 10;
					count /= 10;
					if (digitFlag[digit] == 0) {
						digitFlag[digit] = 1;
						digitCount++;
					}
				} while (digitCount < 10 && count > 0);
			}
			number -= base;
			pw.println("Case #" + (i + 1) + ": " + number);
		}

		pw.flush();
		pw.close();
		sc.close();
	}
}
