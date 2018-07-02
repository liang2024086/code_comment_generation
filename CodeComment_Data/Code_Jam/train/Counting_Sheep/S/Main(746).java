package methodEmbedding.Counting_Sheep.S.LYD1099;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner standardInput = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int numberOfTestCases = standardInput.nextInt();

		for (int testCase = 1; testCase <= numberOfTestCases; testCase++) {
			int i = 1; // Same i in problem statement
			int bitMask = 0; // To keep track of digits encountered
			int N = standardInput.nextInt(); // The number N in problem statement

			if (N != 0) { // 0 will lead to INSOMNIA
				while (bitMask != 1023) { // if all digits are encountered
					int temp = i * N;
					while (temp != 0) { // go through all digits
						bitMask |= 1 << (temp % 10); // set appropriate digit's bit
						temp /= 10;
					}
					i++;
				}
				System.out.println("Case #" + testCase + ": " + (i - 1) * N);
			} else {
				System.out.println("Case #" + testCase + ": INSOMNIA");
			}
		}

		standardInput.close();
	}

}
