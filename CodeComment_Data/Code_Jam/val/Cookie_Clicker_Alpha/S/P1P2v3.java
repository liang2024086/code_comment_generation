package methodEmbedding.Cookie_Clicker_Alpha.S.LYD189;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.Scanner;

public class P1P2v3 {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner in = new Scanner(
				new File(
						"/Users/olvitole/Dropbox/workspace/Googe Code/src/gcj2014/files/B-small-attempt0.in"));
		// Scanner in = new Scanner(System.in);
		int t = Integer.parseInt(in.nextLine());
		OutputStream outStr = new FileOutputStream(
				"/Users/olvitole/Dropbox/workspace/Googe Code/src/gcj2014/files/B1-output.txt");
		PrintStream printOut = new PrintStream(outStr);

		for (int zz = 1; zz <= t; zz++) {

			String[] input = in.nextLine().trim().split(" ");

			double c = Double.parseDouble(input[0]);
			double f = Double.parseDouble(input[1]);
			double x = Double.parseDouble(input[2]);

			double tempNumberOfCookies = 0;
			double time = 0;
			double koeficient = 2;
			double timea = 0;
			double timeb = 0;
			double tempVar = 0;
			while (tempNumberOfCookies != x) {
				time = x / koeficient;
				timea = c / koeficient;
				timeb = x / (koeficient + f);
				if ((timea + timeb) < time) {
					koeficient += f;
					tempVar += timea;
				} else {
					tempNumberOfCookies = x;
					tempVar += time;
				}
			}

			double outputDB = tempVar;

			DecimalFormat df = new DecimalFormat("0.0000000");
			String output = df.format(outputDB);

			System.out.println("Case #" + zz + ": " + output);

			printOut.append("Case #" + zz + ": " + output + "\n");

		}

		System.setOut(printOut);
	}

//	private static boolean buy(double x, double tempNumberOfCookies,
//			double koeficient, double c, double f) {
//		double remainingCookies = x - tempNumberOfCookies;
//		if ((remainingCookies / koeficient) < ((remainingCookies + c) / (koeficient + f)))
//			return false;
//		return true;
//	}
}
