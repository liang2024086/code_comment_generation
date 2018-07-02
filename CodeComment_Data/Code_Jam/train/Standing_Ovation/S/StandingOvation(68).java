package methodEmbedding.Standing_Ovation.S.LYD99;

import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCases = sc.nextInt();
		int maxShy;
		String shyString;
		int ans;
		int people;

		for (int i = 0; i < testCases; i++) {
			maxShy = sc.nextInt();
			shyString = sc.nextLine().trim();
			people = 0;
			ans = 0;
			for (int j = 0; j < shyString.length(); j++) {
				int shyLvl = Integer.parseInt(Character.toString(shyString.charAt(j)));
				people += shyLvl;
				while (people <= j) {
					ans++;
					people++;
				} 
			}
			System.out.println("Case #" + (i+1) + ": " + ans);
		}
	}
}
