package methodEmbedding.Standing_Ovation.S.LYD2207;

import java.util.ArrayList;
import java.util.Scanner;

public class StandingOvation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++) {
			int sMax = input.nextInt();
			String string = input.nextLine().substring(1);
			ArrayList<Integer> aList = new ArrayList<>();
			for (int j = 0; j < sMax + 1; j++)
				aList.add(string.charAt(j) - '0');
			int noStandUp = aList.get(0);
			int needed = 0;
			for (int j = 1; j < sMax + 1; j++) {
				if (noStandUp >= j) {
					noStandUp += aList.get(j);
				}
				else {
					needed += j- noStandUp;
					noStandUp += j - noStandUp + aList.get(j);
				}
			}
			System.out.println("Case #" + (i+1) + ": " + needed);
		}
		input.close();
	}
}
