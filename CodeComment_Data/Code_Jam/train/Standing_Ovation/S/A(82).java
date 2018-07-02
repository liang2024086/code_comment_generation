package methodEmbedding.Standing_Ovation.S.LYD1820;

import java.util.Scanner;


public class A {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int kases = in.nextInt();
		int max, total, friends, stage;
		String line;
		
		for (int kase=1; kase<=kases; kase++) {
			max = in.nextInt();
			line = in.nextLine().trim();
			total = line.charAt(0) - '0';
			friends = 0;
			
			if (total == 0) {
				total++;
				friends++;
			}
			
			for (int i=1; i<=max; i++) {
				stage = line.charAt(i) - '0';
				if (stage > 0) {
					if (total < i) {
						friends += i-total;
						total = i;
					}
					total += stage;
				}
			}
			
			System.out.printf("Case #%d: %d\n", kase, friends);
		}
	}
}
