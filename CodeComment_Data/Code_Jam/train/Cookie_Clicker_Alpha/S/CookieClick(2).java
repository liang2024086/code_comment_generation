package methodEmbedding.Cookie_Clicker_Alpha.S.LYD90;


import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.jws.Oneway;

public class CookieClick {
	static Double temp = 0.0;
	static Double time = 0.0;

	public static void main(String[] args) throws IOException {
		String inFile = "D:/B-small-attempt1.in";
		String outFile = "D:/B-small-attempt1.out";
		double[] arr = new double[3];
		Scanner sc = new Scanner(new FileReader(inFile));
		PrintWriter pw = new PrintWriter(outFile);
		int caseInput = sc.nextInt();
		sc.nextLine();
		int numberCaseIndex = 1;
		while (caseInput > 0) {
			temp = 0.0;
			time = 0.0;
			String text = sc.nextLine();
			StringTokenizer stk = new StringTokenizer(text);
			int number = 0;
			while (stk.hasMoreTokens()) {
				arr[number] = Double.parseDouble(stk.nextToken());
				number++;
			}
			double cookie = 2;
			double c = arr[0];
			double f = arr[1];
			double x = arr[2];
			time = x / cookie;
			on: while (true) {
				temp = temp + (c / cookie);
				if (temp + (x / (cookie + f)) <= time) {
					time = temp + (x / (cookie + f));
					cookie = cookie+f;
				} else {
					break on;
				}
			}

			pw.printf("Case #%d: %.07f \n", numberCaseIndex, time);
			caseInput--;
			numberCaseIndex++;
			pw.flush();
			
		}
		pw.close();
	}
}
