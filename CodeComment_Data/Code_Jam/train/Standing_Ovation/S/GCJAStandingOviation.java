package methodEmbedding.Standing_Ovation.S.LYD1338;

import java.util.Scanner;


public class GCJAStandingOviation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		
		for(int i = 1; i<=cases; i++) {
			int shymax = sc.nextInt();
			String shys = sc.next();
			
			int counter = shys.charAt(0) - 48;
			int maxdiff = 0;
			for(int j = 1; j<=shymax; j++) {
				if(j-counter > maxdiff) {
					maxdiff = j-counter;
				}
				counter += shys.charAt(j) - 48;
			}
			System.out.println("Case #"+ i + ": " + maxdiff);
		}
		
	}
}
