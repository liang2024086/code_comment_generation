package methodEmbedding.Standing_Ovation.S.LYD1170;

import java.util.Scanner;

public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int mxShy;
		String shyVal;
		for (int i = 0; i < n; i++) {
			mxShy = scan.nextInt();
			shyVal = scan.next();

			int totalShy = 0;
			int needed = 0;
			for (int j = 0; j < mxShy + 1; j++) {
				int curVal = shyVal.charAt(j) - 48;
				if (totalShy + needed < j) {
					needed = j - totalShy;
				}
				totalShy += curVal;
			}
			System.out.println("Case #"+(i+1)+": "+needed);
		}

	}

}
