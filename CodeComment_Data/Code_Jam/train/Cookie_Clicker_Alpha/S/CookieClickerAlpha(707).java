package methodEmbedding.Cookie_Clicker_Alpha.S.LYD542;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new FileInputStream(args[0]));
		PrintWriter pw = new PrintWriter("output.txt");
		int testCases = scanner.nextInt();
		for (int i = 1; i <= testCases; i++) {
			double c = scanner.nextDouble();
			double f = scanner.nextDouble();
			double x = scanner.nextDouble();
			double r = 2;
			double t = 0;
			while ((x - c) / r >= x / (r + f)) {
				t += c / r;
				r += f;
			}
			t += x / r;
			pw.println("Case #"+ i + ": " + t);
		}
		pw.close();
		scanner.close();
	}
}
