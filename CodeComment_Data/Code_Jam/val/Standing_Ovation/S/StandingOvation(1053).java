package methodEmbedding.Standing_Ovation.S.LYD2045;

import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		for(int i=0; i<t; i++) {
			String line[] = scan.nextLine().split(" ");
			int seen = 0;
			int friendsNeeded = 0;
			for(int j=0; j<line[1].length(); j++) {
				int num = Character.getNumericValue(line[1].charAt(j));
				if (j > seen) {
					int diff = j - seen;
					friendsNeeded += diff;
					seen += diff;
				}
				seen += num;
			}
			
			System.out.println("Case #" + (i + 1) + ": " + friendsNeeded);
		}
		
		scan.close();
	}
}
