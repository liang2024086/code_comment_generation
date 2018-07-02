package methodEmbedding.Standing_Ovation.S.LYD75;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] a) throws FileNotFoundException {
		int T;
		int sMax;
		String str;

		Scanner scan = new Scanner(new File("A-small-attempt6.in"));
		PrintWriter pw = new PrintWriter(new File("o.txt"));
		T = scan.nextInt();
		int count = 0;
		int count1 = 0;
		int shyP[];
		int shyR[];
		int ANS[] = new int[6];
		int sum = 0;

		for (int j = 0; j < T; j++) {
			count = 0;
			count1 = 0;
			sMax = scan.nextInt();
			str = scan.next();
			shyP = new int[str.length()];
			shyR = new int[str.length()];

			for (int i = 0; i < str.length(); i++) {
				shyP[i] = Integer.parseInt(str.charAt(i) + "");
				shyR[i] = i;
			}
			sum = 0;
			for (int k = 0; k < shyP.length; k++) {

				count = 0;
				if (shyR[k] >= sum && shyP[k] != 0 && k != shyP.length) {

					count = shyR[k] - sum;
					count1 += count;
					sum = sum + count;
				}
				sum = sum + shyP[k];
			}

			pw.println("Case #" + (j + 1) + ": " + count1);

		}
		pw.close();

	}
}
