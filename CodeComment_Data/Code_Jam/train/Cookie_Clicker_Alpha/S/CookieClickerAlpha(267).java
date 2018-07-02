package methodEmbedding.Cookie_Clicker_Alpha.S.LYD972;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CookieClickerAlpha {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("bin/input.txt"));
		BufferedWriter writer = new BufferedWriter(new FileWriter(
				"bin/output.txt"));

		int t;
		t = scanner.nextInt();
		
		int ca = 1;
		
		while (t-- > 0) {
			double c, f, x;
			c = scanner.nextDouble();
			
			f = scanner.nextDouble();
			x = scanner.nextDouble();
			double rate = 2;
			double totalTime = 0;

			while (true) {
				double timeToProduceC = c / rate;
				double newRate = rate + f;

				if (totalTime + timeToProduceC + (x / newRate) < totalTime
						+ (x / rate)) {
					totalTime += timeToProduceC;
					// System.out.println(timeToProduceC);
					// System.out.println(newRate);
					// System.out.println();
					rate = newRate;

				} else {
					totalTime += (x / rate);
					break;
				}
			}
			writer.write("Case #" + ca++ + ": "+ totalTime + "\r\n");
		}
		scanner.close();
		writer.close();
	}

}
