package methodEmbedding.Counting_Sheep.S.LYD545;

import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		int[] testData = new int[testCases];
		for (int i = 0; i < testCases; i++) {
			testData[i] = scanner.nextInt();
		}
		for (int i = 0; i < testCases; i++) {
			boolean[] isdigitPresent = new boolean[10];
			int number = 0;
			boolean allDigitsFound = false;
			if (testData[i] == 0) {
				allDigitsFound = true;
				System.out.println("Case #" + (i + 1) + ": INSOMNIA");
				continue;
			}
			while (!allDigitsFound) {
				number = number + testData[i];
				String digits = String.valueOf(number);
				for (int j = 0; j < digits.length(); j++) {
					isdigitPresent[Integer.parseInt(String.valueOf(digits.charAt(j)))] = true;
				}
				for (int j = 0; j < 10; j++) {
					allDigitsFound = true;
					if (!isdigitPresent[j]) {
						allDigitsFound = false;
						break;
					}
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + number);
		}
		scanner.close();
	}

}
