package methodEmbedding.Standing_Ovation.S.LYD340;

import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		int caseNo = 0;

		while (scanner.hasNext()) {
			caseNo++;
			int sMax = scanner.nextInt();
			int sLevel[] = new int[sMax + 1];

			char[] sLevelArr = scanner.nextLine().trim().toCharArray();
			for (int i = 0; i < sLevelArr.length; i++) {
				sLevel[i] = Integer.parseInt(sLevelArr[i] + "");
			}

			int friendCount = 0;
			int shyCount = sLevel[0];
			for (int i = 1; i < sLevel.length; i++) {
				if (i > shyCount) {	
					friendCount++;
					sLevel[i]++;
				}
				shyCount += sLevel[i];
			}
			System.out.println("Case #" + caseNo + ": " + friendCount);
		}

		scanner.close();
	}
}
