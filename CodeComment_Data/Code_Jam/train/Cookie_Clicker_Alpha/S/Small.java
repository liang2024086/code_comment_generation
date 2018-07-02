package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1193;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Small {

	public static void main(String[] args) {
		Scanner scanner;
		try {
			scanner = new Scanner(new File("D:/CodeJam/B-small-attempt0.in"));

			int n = scanner.nextInt();
			for (int i = 1; i <= n; i++) {
				double c = scanner.nextDouble();
				double f = scanner.nextDouble();
				double x = scanner.nextDouble();
				int nFarm = 0;
				double time = 0;
				while (true) {
					if (x / (2 + f * nFarm) <= (c / (2 + f * nFarm) + x
							/ (2 + f * (nFarm + 1)))) {
						time += x / (2 + f * nFarm);
						break;
					} else {
						time += c / (2 + f * nFarm);
						nFarm++;
					}
				}
				System.out.println("Case #" + i + ": " + time);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
