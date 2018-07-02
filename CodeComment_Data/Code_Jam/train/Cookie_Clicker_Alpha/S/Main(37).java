package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1322;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author t7639192
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		final double initialFreq = 2;
		final Scanner in = new Scanner(new File("C:\\Users\\T7639192\\Desktop\\????????????\\?????????? ??\\??????\\Google Code Jam\\GCJ2014 Q P2\\src\\B-small-attempt0.in"));
		PrintWriter writer = new PrintWriter("C:\\Users\\T7639192\\Desktop\\????????????\\?????????? ??\\??????\\Google Code Jam\\GCJ2014 Q P2\\src\\output.txt", "UTF-8");
		int T = in.nextInt();
		for (int caseNum = 1; caseNum <= T; caseNum++) {
			double C, F, X;
			C = in.nextDouble();
			F = in.nextDouble();
			X = in.nextDouble();

			double minimumTime = X / initialFreq;
			int n = 1;
			double tempTime = minimumTime - (X - C) / (initialFreq + F * (n - 1)) + X / (initialFreq + F * n);
			while (tempTime < minimumTime) {
				minimumTime = tempTime;
				n++;
				tempTime = minimumTime - (X - C) / (initialFreq + F * (n - 1)) + X / (initialFreq + F * n);
			}
			writer.println("Case #" + caseNum + ": " + minimumTime);
		}
		writer.close();
	}
}
