package methodEmbedding.Counting_Sheep.S.LYD1596;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountingSheep {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream(new File("A-small-attempt0.in")))));
//		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = in.nextInt();
		boolean[] seenDigits = new boolean[10];
		int[] inputs = new int[t];
		int[] outputs = new int[t];
		for (int i = 0; i < t; i++) {
			inputs[i] = in.nextInt();
		}

		for (int i = 0; i < inputs.length; i++) {
			int input = inputs[i];
			for (int j = 0; j < 10; j++) {
				seenDigits[j] = false;
			}

			boolean allDigitSeen = false;
			if (input == 0) {
				outputs[i] = 0;
			}
			else {
				for (int multiply = 1; multiply <= 1000; multiply++){
					int currentNumber = input * multiply;
					int number = currentNumber;
					while (number > 0) {
						int digit = number % 10;
						number /= 10;
						seenDigits[digit] = true;
					}

					boolean allSeen = true; 
					for (boolean seenDigit : seenDigits) {
						if (!seenDigit) {
							allSeen = false;
						}
					}

					if (allSeen) {
						outputs[i] = currentNumber;
						allDigitSeen = allSeen;
						break;
					}
				}
				
				if (!allDigitSeen) {
					outputs[i] = -1;
				}
			}
		}
		for (int i = 0; i < inputs.length; i++) {
			System.out.println("Case #" + (i+1) + ": " + (outputs[i] > 0 ? outputs[i] : "INSOMNIA"));			
		}
	}
}
