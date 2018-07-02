package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1482;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Cookiess {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("BInput.in"));
		s.useLocale(Locale.US);//Something fishy with decimal seperator.Change it to dot(.)
		int R = s.nextInt();
		for (int i = 1; i <= R; i++) {
			double C = s.nextDouble();
			double F = s.nextDouble();
			double X = s.nextDouble();
			double I = 2.0;
			double totalTime = 0;
			while (true) {
				double cur = X / I;
				double next = C / I + X / (F + I);
				if (cur > next) {
					totalTime += C / I;
					I += F;
				} else {
					totalTime += X / I;
					break;
				}
			}
			System.out.printf("Case #%d: %.7f\n",i,totalTime);
		}
		s.close();
	}
}
