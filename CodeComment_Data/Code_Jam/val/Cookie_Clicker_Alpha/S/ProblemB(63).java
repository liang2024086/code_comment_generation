package methodEmbedding.Cookie_Clicker_Alpha.S.LYD75;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ProblemB {

	public static void main(String[] args) throws IOException {
		File file = new File("B-small-attempt0.in");
		FileWriter fstream = new FileWriter("B-small-out.txt");
		BufferedWriter out = new BufferedWriter(fstream);
		@SuppressWarnings("resource")
		Scanner in = new Scanner(file);
		int T = in.nextInt();
		
		for (int t=1; t<=T; t++) {
			double c = in.nextDouble();
			double f = in.nextDouble();
			double x = in.nextDouble();

			double time = 0.0;
			double numCookies = 0.0;
			double cookiesPerSecond = 2.0;
			int numFarms = 0;

			double time2 = 0.0;
			while (x/cookiesPerSecond >= c/cookiesPerSecond+(x/(cookiesPerSecond+f))) {
				time += c/cookiesPerSecond;
				++numFarms;
				cookiesPerSecond += f;
			}

			time += x/cookiesPerSecond;

			out.write("Case #"+ t +": " + time);
			out.newLine();
		}
		
		out.close();
	}
}
