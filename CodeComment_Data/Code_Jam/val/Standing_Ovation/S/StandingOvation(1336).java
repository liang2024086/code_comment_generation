package methodEmbedding.Standing_Ovation.S.LYD1642;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class StandingOvation {
	public static void main(String [] args) throws IOException {
		Scanner input = new Scanner(new File("A-small-attempt0.in"));
		int ct = input.nextInt();
		int casenum = 1;
		while(ct-- > 0) {
			input.next();
			String line = input.next();
			int friends = 0;
			int total = 0;
			for(int i = 0; i < line.length(); i++) {
				int num = line.charAt(i) - '0';
				if(num > 0 && i > total) {
					friends += i - total;
					total += i - total;
				}
				total += num;
			}
			System.out.printf("Case #%d: %d%n", casenum++, friends);
		}
	}
}
