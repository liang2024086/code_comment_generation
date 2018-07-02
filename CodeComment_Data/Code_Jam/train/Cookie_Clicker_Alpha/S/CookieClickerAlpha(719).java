package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1249;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CookieClickerAlpha {
	public static void main(String args[]) {

		try {
			BufferedReader bf = new BufferedReader(new FileReader("git.txt"));

			int testCases = Integer.parseInt(bf.readLine());
			for (int x = 0; x < testCases; x++) {
				String input = bf.readLine();
				String inputArray[] = input.split(" ");

				// Converstin to doubles
				double inputValues[] = new double[inputArray.length];
				for (int i = 0; i < inputArray.length; i++) {
					inputValues[i] = Double.parseDouble(inputArray[i]);
				}
				double cm = Double.MAX_VALUE;
				double current = 0;
				double rate = 2;
				while (true) {
					// normal
					double newValue = current + inputValues[2] / rate;
					if (newValue < cm) {
						cm = newValue;
					} else {
						double answer = (double) Math.round(cm * 10000000) / 10000000;
						System.out.println("Case #" + (x + 1) + ": "
								+ answer);
						break;
					}
					current += inputValues[0] / rate;
					rate += inputValues[1];

				}
			}
			bf.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
