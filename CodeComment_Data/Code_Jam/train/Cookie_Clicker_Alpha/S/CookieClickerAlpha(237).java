package methodEmbedding.Cookie_Clicker_Alpha.S.LYD532;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) throws FileNotFoundException,
			UnsupportedEncodingException {

//		Scanner sc = new Scanner(new File("input2.txt"));
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
		
		PrintWriter writer = new PrintWriter("outputBs.txt", "UTF-8");

		int cases = sc.nextInt();

		double C, F, X;
		double farms, rate, penalty, total;
		String message;

		for (int c = 1; c <= cases; c++) {

			C = sc.nextDouble();
			F = sc.nextDouble();
			X = sc.nextDouble();

			farms = 0;
			rate = 2;
			penalty = 0;
			total = X / rate + penalty;

			for (farms = 1; farms < X; farms++) {
				penalty += C / rate;
				rate += F;
				double temp = X / rate + penalty;
				if (temp < total) {
					total = temp;
				} else {
					break;
				}
			}

			DecimalFormat df = new DecimalFormat("#.#######");

			message = "" + Double.valueOf(df.format(total));
			
			int length = message.split("\\.")[1].length();
			for (int i = length; i < 7; i++) {
				message += "0";
			}

			message = "Case #" + c + ": " + message;
//			System.out.println(message);
			writer.println(message);
		}

		writer.close();
	}

}
