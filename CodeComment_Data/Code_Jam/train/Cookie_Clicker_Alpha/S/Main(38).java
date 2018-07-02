package methodEmbedding.Cookie_Clicker_Alpha.S.LYD66;

import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nbTest = Integer.valueOf(sc.nextLine()).intValue();
		String[] line = null;
		for (int u = 0; u < nbTest; u++) {
			line = sc.nextLine().split(" ");
			double farmCost = Double.valueOf(line[0]).doubleValue();
			double farmCPS = Double.valueOf(line[1]).doubleValue();
			double goal = Double.valueOf(line[2]).doubleValue();

			boolean b = true;

			double CPS = 2;
			double time = 0;

			while (b) {
				double tf = farmCost / CPS;
				double tg = goal / CPS;

//				double tf2 = farmCost / (CPS + farmCPS);
				double tg2 = goal / (CPS + farmCPS);

				double tc = time + tg;
				double tc2 = time + tf + tg2;

				if (tc < tc2) {
					b = false;
					int k = u + 1;
					System.out.println("Case #" + k + ": " + tc);
				} else {
					time += tf;
					CPS += farmCPS;
				}
			}

		}
	}
}
