package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1238;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class PB {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("B-small-attempt0.in"));
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			double C = sc.nextDouble();
			double F = sc.nextDouble();
			double X = sc.nextDouble();
			double time = X / 2;
			int n = 1;
			double timeFarm = 0;
			while (true) {
				timeFarm += C / (2 + (n - 1) * F);
				double newTime = timeFarm + X / (2 + n * F);
				if (newTime < time) {
					time = newTime;
					n++;
				} else {
					System.out.printf("Case #%d: %.7f\n", i + 1, time);
					break;
				}
			}
		}
		sc.close();
	}

}
