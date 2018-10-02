package methodEmbedding.Standing_Ovation.S.LYD1619;

import java.util.Scanner;


public class StandingOvation {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t = 1; t <= T; t++) {
			int S = scan.nextInt();
			int invite = 0;
			int clapping = 0;
			String s = scan.next();
			for(int i = 0; i <= S; i++) {
				if(clapping < i) {
					invite += i-clapping;
					clapping = i;
				}
				clapping += s.charAt(i) - '0';
			}
			System.out.println("Case #" + t + ": " + invite);
		}
	}
}
