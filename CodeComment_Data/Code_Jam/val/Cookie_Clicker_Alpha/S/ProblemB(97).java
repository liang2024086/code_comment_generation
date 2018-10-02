package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1145;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemB {

	public ProblemB(String filename) {
		try {
			Scanner input = new Scanner(new File(filename));
			int testCases = input.nextInt();
			double C, F, X;

			for (int i = 0; i < testCases; i++) {
				C = input.nextDouble();
				F = input.nextDouble();
				X = input.nextDouble();
				double rate = 2.0;
				double additionalTime = 0.0;// Time used to buy factories.

				// int j = 10;
				while (true) {
					// Time without buying new factory. PRESENT
					double time1 = X / rate + additionalTime;
					// Time with buying new factory. FUTURE
					double time2 = X / (rate + F) + C / rate + additionalTime;
					//System.out.println(time1);
					if (time1 <= time2) {
						System.out.println("Case #" + (i + 1) + ": " + (time1));
						break;
					}
					// Buy new farm.
					additionalTime += C / rate;
					rate += F;

					// if (j <= 0)
					// break;
					// j--;
				}
			}
			input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new ProblemB(args[0]);
	}
}
