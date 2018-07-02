package methodEmbedding.Counting_Sheep.S.LYD480;

import java.util.*;
import java.io.*;

public class GoogleJamIn {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt(); // Scanner has functions to read ints, longs,
								// strings, chars, etc.

		for (int i = 1; i <= t; ++i) {
			boolean[] flag = new boolean[10];
			int n = in.nextInt();
			
			if (n == 0) {
				System.out.println("Case #" + i + ": INSOMNIA");
				continue;
			}
			
			int sheepCount = 1;
			while (true) {
				int output = n * sheepCount;
				 // iterations Bleatrix counted
				int sleepyHead = n * sheepCount;
				int digitCount = 0;
				
				while (sleepyHead > 0) {
					int counted = sleepyHead % 10;
					flag[counted] = true;
					sleepyHead /= 10;
				}
				
				digitCount = 0;
				for (int k = 0; k < flag.length; k++) {
					if (flag[k] == true) {
						digitCount++;
					}
				}
				
				if (digitCount == 10) {
					System.out.println("Case #" + i + ": " + output);
					break;
				}
				else {
					sheepCount++;
				}
			}
		}
	}
}
