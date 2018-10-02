package methodEmbedding.Standing_Ovation.S.LYD2064;

import java.util.Scanner;

public class StandingOvation {
	public static void main(String[] args) {
		int numCases, nc, i;
		String smax, counts;
		Scanner sc = new Scanner(System.in);
		numCases = sc.nextInt();
		sc.nextLine();
		for(nc=1; nc<=numCases; nc++) {
			smax = sc.next();
			counts = sc.next();
			int extras = 0;
			for(int shyness=0; shyness<counts.length(); shyness++) {
				int c = ((int) counts.charAt(shyness)) - 48;
				if(c==0)
					continue;
				int standing = 0;
				for(i=0; i<shyness; i++) {
					standing += ((int)counts.charAt(i))-48;
				}
				standing += extras;
				if(standing<shyness) {
					extras += shyness - standing;
				}
			}
			System.out.println("Case #" + nc + ": " + extras);
		}
	}
}
