package methodEmbedding.Cookie_Clicker_Alpha.S.LYD593;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class ProblemB {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("B-small-attempt0.in"));
		System.setOut(new PrintStream(new FileOutputStream("B-small-attempt0.out")));
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for (int caseNum = 1; caseNum <= T; caseNum++) {
			double C = in.nextDouble();
			double F = in.nextDouble();
			double X = in.nextDouble();
			
			double rate = 2.0;
			
			double t = 0;
			while (true) {
				double xt = X / rate;
				double buyt = (C / rate);
				double ft = (C / rate) + (X / (rate + F));
				if (xt < ft) {
					t += xt;
					break;
				} else {
					t += (C / rate);
					rate += F;
				}
			}
			System.out.printf("Case #%d: %.08f%n", caseNum, t);
		}
	}
}
