package methodEmbedding.Cookie_Clicker_Alpha.S.LYD970;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Scanner in = new Scanner(new File("D:\\Downloads\\B-small-attempt0.in"));
			FileWriter out = new FileWriter("D:\\Downloads\\B.out");

			int n = in.nextInt();

			for (int i = 0; i < n; i++) {
				double c = in.nextDouble();
				double f = in.nextDouble();
				double x = in.nextDouble();

				double spent = 0;
				double rate = 2;
				double next = c / rate + x / (rate + f);

				while (next < x / rate) {
					spent += c / rate;
					rate += f;
					next = c / rate + x / (rate + f);
				}

				spent += x / rate;

				DecimalFormat decimalFormat = new DecimalFormat(".0000000");
				String resultString = "Case #" + (i + 1) + ": "
						+ decimalFormat.format(spent);
				out.write(resultString + "\n");
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
