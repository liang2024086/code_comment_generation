package methodEmbedding.Counting_Sheep.S.LYD1343;

import java.util.*;
import java.io.*;

public class CountingSheep {
	public static void main(String[] args) {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

		int N = in.nextInt();
		boolean[] digits = new boolean[10];

		for (int i = 1; i < N + 1; i++) {

			digits = new boolean[10];
			int input = in.nextInt();
			int temp = 1;
			boolean sleep = false;

			for (int j = 1; j < 100; j++) {
				
				if (input == 1 && temp == 1) {
					temp = (input + 1) * j;
				} else {
					temp = input * j;
				}
				
				String number = String.valueOf(temp);
				
				for (int k = 0; k < number.length(); k++) {
					int index = Integer.parseInt(number.substring(k, k + 1));
					digits[index] = true;
				}
				if (j > 2) {
					sleep = true;
					for (int e = 0; e < 10; e++) {
						if (digits[e] == false) {
							sleep = false;
						}
					}
				}
				if (sleep) {
					System.out.println("Case #" + i + ": " + temp);
					break;
				} else if (j == 99 && !sleep) {
					System.out.println("Case #" + i + ": " + "INSOMNIA");
				}
			}
		}
	}
}
