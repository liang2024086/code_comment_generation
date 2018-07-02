package methodEmbedding.Cookie_Clicker_Alpha.S.LYD390;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CookieClickerAlpha {
	static String PATH = "data/gcj2014/qual/", PROBLEM = "B", SIZE = "small",
			ATTEMPT = "0";

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		String filename = PATH + PROBLEM + "-" + SIZE;
		if (SIZE.equals("small"))
			filename += "-attempt" + ATTEMPT;
		Scanner sc = new Scanner(new File(filename + ".in"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(PATH + PROBLEM
				+ "-" + SIZE + "-attempt" + ATTEMPT + ".out"));
		int T = sc.nextInt();
		for (int t = 0; t < T; t++) {
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double time = -1;
			int k = 0;
			while (true) {
				double cost = 2;
				double temp = 0;
				for (int i = 0; i < k; i++) {
					temp += C / cost;
					cost += F;
				}
				temp += X / cost;
				if (time < 0 || temp < time) {
					// continue to search next
					time = temp;
				} else {
					// the "time" is already the best solution
					break;
				}
				k++;
			}

			bw.write("Case #" + (t + 1) + ": " + time);
			bw.newLine();
		}
		sc.close();
		bw.close();
	}

}
