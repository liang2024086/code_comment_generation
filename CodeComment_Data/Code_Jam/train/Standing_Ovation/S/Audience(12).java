package methodEmbedding.Standing_Ovation.S.LYD1205;

import java.util.Scanner;

public class Audience {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int i = 1; i < n + 1; i++) {
			
			String[] split = s.nextLine().split(" ");
			int peopleNeeded = 0;
			for (int j = 1; j < split[1].length() ; j++) {
				int people = 0;
				for (int j2 = 0; j2 < j ; j2++) {
					people += Integer.parseInt(split[1].substring(j2, j2 + 1));
				}
				int temp = j - people;
				peopleNeeded = Math.max(peopleNeeded, temp);
			}
			if (peopleNeeded < 0) {
				peopleNeeded = 0;
			}
			System.out.println("Case #" + i + ": " + peopleNeeded);
		}
	}

}
