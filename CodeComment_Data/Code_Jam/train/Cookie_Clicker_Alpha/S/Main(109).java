package methodEmbedding.Cookie_Clicker_Alpha.S.LYD33;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < t; i++) {
			int caseNo = i + 1;
			String[] l = scan.nextLine().split(" ");
			double[] dl = new double[l.length];
			for (int k = 0; k < dl.length; k++) {
				dl[k] = Double.parseDouble(l[k]);
			}
			double C = dl[0];
			double F = dl[1];
			double X = dl[2];
			double cps = 2;
			double seconds = 0;
			boolean finish = false;
			DecimalFormat newFormat = new DecimalFormat("#.#######");
			while (!finish) {
				if (X / cps < C / cps + X / (cps + F)) {
					seconds += X / cps;
					finish = true;
				} else {
					seconds += C / cps;
					cps += F;
				}
			}
			System.out.println("Case #" + caseNo + ": "
					+ Double.valueOf(newFormat.format(seconds)));
		}
		scan.close();
	}

}
