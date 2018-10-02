package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1585;

import java.io.FileInputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author Olexandr Tolstykh (o.tolstykh@samsung.com)
 */
public class ProblemB {

	private static final double BASIC_STEP_2 = 2;

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("inputB.txt"));
		PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; ++i) {
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();

			double ans = x / BASIC_STEP_2;
			double fPreviousInC = c / BASIC_STEP_2;
			double stepCounter = 1;
			while (true) {
				double koef = 2 + stepCounter * f;
				double newAnswer = fPreviousInC + x / koef;
				if (newAnswer < ans && newAnswer > 0) {
					ans = newAnswer;
					fPreviousInC = fPreviousInC + c / koef;
					stepCounter++;
				} else {
					break;
				}
			}

			NumberFormat formatter = new DecimalFormat("#0.0000000");
			writer.println("Case #" + (i + 1) + ": " + formatter.format(ans));
			
			System.out.println("Case #" + (i + 1) + ": " + formatter.format(ans));
		}
		sc.close();
		writer.close();
	}
}
