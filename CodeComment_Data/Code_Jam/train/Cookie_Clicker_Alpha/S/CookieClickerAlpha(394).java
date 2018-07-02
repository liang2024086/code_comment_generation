package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1086;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
/**
 * Cookie Clicker Alpha
 * Question B from Google Code Jam 2014
 *
 * @author William Glenn Hollingsworth
 * @version 1.0
 */
public class CookieClickerAlpha {
	private Scanner scan;
	private BufferedWriter writer;

	public CookieClickerAlpha() {
		try {
			scan = new Scanner(new File("B-small-attempt0.in"));
			writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("output.txt"), "utf-8"));
			int tests = Integer.parseInt(scan.nextLine());
			for (int i = 1; i <= tests; i++) {
				double mC = scan.nextDouble();
				double mF = scan.nextDouble();
				double mX = scan.nextDouble();
				double time = 0;
				double cps = 2;
				boolean found = false;
				while ((mX / cps) > ((mC / cps) + (mX / (cps + mF)))) {
					time += mC / cps;
					cps += mF;
				}
				time += mX / cps;
				writer.write("Case #" + i + ": " + time + "\n");
			}
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}
	}


	public static void main(String[] args) {
		new CookieClickerAlpha();
	}
}
