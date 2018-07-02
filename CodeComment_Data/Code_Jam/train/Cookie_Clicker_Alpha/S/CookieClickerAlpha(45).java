package methodEmbedding.Cookie_Clicker_Alpha.S.LYD94;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CookieClickerAlpha {

	public static void main(String[] args) {
		String out = "./output.txt";
		String in = "./B-small-attempt0.in";
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File(out));
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
		}
		Scanner sc = null;
		try {
			sc = new Scanner(new File(in));
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
		}
		int numCases = sc.nextInt();
		for (int caseNum = 1; caseNum <= numCases; caseNum++) {
			double c = sc.nextDouble();
			double f = sc.nextDouble();
			double x = sc.nextDouble();
			int numFarms = (int) Math.ceil((x / c) - (2 / f) - 1);
			if (numFarms < 0) {
				numFarms = 0;
			}
			double time = x / (2 + numFarms * f);
			for (int i = 0; i < numFarms; i++) {
				time += c / (2 + i * f);
			}
			pw.println("Case #" + caseNum + ": " + time);
		}
		pw.flush();
		pw.close();
		sc.close();
	}

}
