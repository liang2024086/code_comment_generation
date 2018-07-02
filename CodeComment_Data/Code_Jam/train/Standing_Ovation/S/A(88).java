package methodEmbedding.Standing_Ovation.S.LYD851;

import java.util.Scanner;

public class A {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int casesT = scanner.nextInt();
		for (int cases = 1; cases <= casesT; cases++) {
			int extraPeople = 0;
			int[] audience = new int[scanner.nextInt() + 1];
			String people = scanner.next();
			
			for (int i = 0; i < people.length(); i++) {
				audience[i] = people.charAt(i) - '0';
			}
			int tierPeople = audience[0];
			for (int i = 1; i < audience.length; i++) {
				if (tierPeople + extraPeople < i) {
					extraPeople += i - extraPeople - tierPeople;
				}
				tierPeople += audience[i];
			}
			System.out.format("Case #%d: %d\n", cases, extraPeople);
		}
	}
}
