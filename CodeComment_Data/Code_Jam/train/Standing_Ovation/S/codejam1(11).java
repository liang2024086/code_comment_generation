package methodEmbedding.Standing_Ovation.S.LYD585;

import java.util.Scanner;

public class codejam1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int inputs = Integer.parseInt(s.nextLine());
		String[] lines = new String[inputs];
		for (int i = 0; i < inputs; i++) {
			lines[i] = s.nextLine();
		}
		for (int i = 0; i < inputs; i++) {
			String[] parts = lines[i].split(" ");
			int x = Integer.parseInt(parts[0]);
			int peopleStanding = 0;
			int d = 0;
			for (int j = 0; j <= x; j++) {
				peopleStanding += parts[1].charAt(j) - 48;
				if (j >= peopleStanding) {
					d++;
					peopleStanding++;
				}
				// System.out.println("pn:" + j + " ps:" + peopleStanding);
				// d += c;
			}
			System.out.println("Case #" + (i + 1) + ": " + d);
		}
	}
}
