package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1527;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class problem_b {

	public static final String inputFilename = "B-small.in";
	public static final String outputFilename = "src/B-small.out";

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(problem_b.class.getResourceAsStream(inputFilename));
		PrintWriter pw = new PrintWriter(new FileWriter(outputFilename));

		DecimalFormat df = new DecimalFormat("0.0000000");

		int no_of_cases = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < no_of_cases; i++) {
			double C = scanner.nextDouble();
			double F = scanner.nextDouble();
			double X = scanner.nextDouble();

			if (scanner.hasNext())
				scanner.nextLine();

			double rate = 2.0d;
			double duration = 0.0d;

			while (true) {

				double timeToWait = C / (rate);

				duration += timeToWait;

				double newToWait = X / (rate + F);

				double timeToComplete = (X - C) / rate;

//				System.out.println("newToWait : " + newToWait);
//				System.out.println("timeToComplete : " + timeToComplete);

				if (timeToComplete > newToWait) {
					rate += F;
				} else {
					duration += timeToComplete;
					break;
				}
			}

			String result = "Case #" + (i + 1) + ": " + df.format(duration);

			System.out.println(result);
			pw.println(result);
		}

		scanner.close();
		pw.flush();
		pw.close();
	}

}
