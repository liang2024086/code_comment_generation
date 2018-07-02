package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1450;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class CookieClickerAlpha {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(args[0]);
		PrintWriter pw = new PrintWriter(new File(args[1]));
		Scanner scanner = new Scanner(fis);
		int T = scanner.nextInt();
		for (int t = 0; t < T; t++) {
			double C = scanner.nextDouble();
			double F = scanner.nextDouble();
			double X = scanner.nextDouble();
			
			double min = X / 2;
			double current = 0;
			double f = 2;
			while (true) {
				double buildNewC = C / f;
				if (current + buildNewC >= min)
					break;
				current += buildNewC;
				f += F;
				double newMin = current + X / f;
				min = min < newMin ? min : newMin;
			}
			
			pw.println("Case #" + (t+1) + ": " + min);
		}
		pw.close();
	}

}
