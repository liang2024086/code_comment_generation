package methodEmbedding.Cookie_Clicker_Alpha.S.LYD861;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InputStream inputStream = System.in;
			OutputStream outputStream = System.out;
			BufferedReader in = new BufferedReader(new InputStreamReader(
					inputStream));
			String line = in.readLine();
			int testCount = Integer.parseInt(line);
			System.out.println("\n");

			for (int testCases = 1; testCases <= testCount; testCases++) {

				double cps = 2.0;
				double previousXseconds = 0;
				double xSeconds = 0;
				double seconds = 0;
				double previousseconds = 0;

				line = in.readLine();
				StringTokenizer tokenizer = tokenizer = new StringTokenizer(line);

				double c = Double.parseDouble(tokenizer.nextToken());
				double f = Double.parseDouble(tokenizer.nextToken());
				double x = Double.parseDouble(tokenizer.nextToken());
//				System.out.println(" new --- c:" + c + "f: " + f + "x: " + x);
//				System.out.println(" new --- testcase:" + testCases);

				do {
					previousXseconds = xSeconds;
					seconds = c / cps;
					xSeconds = previousseconds + x / cps;
					previousseconds = previousseconds + seconds;
					cps = cps + f;

//					System.out.println(" new --- seconds:" + seconds
//							+ "previousXseconds: " + previousXseconds
//							+ "previousseconds: " + previousseconds + "cps: "
//							+ cps);
//					System.out.println(previousXseconds < x / cps);

				} while (previousXseconds > xSeconds || previousXseconds == 0);
//				System.out.printf(Case #"+testCases+": "+previousXseconds"%.2f", val);
				System.out.printf("Case #%d: %.7f\n",testCases,previousXseconds);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
