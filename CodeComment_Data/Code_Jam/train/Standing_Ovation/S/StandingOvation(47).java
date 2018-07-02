package methodEmbedding.Standing_Ovation.S.LYD830;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cases = in.nextInt();
		
		for (int i=1; i<=cases; i++) {
			int max = in.nextInt();
			int sum = 0;
			int cur = 0;
			
			int[] levels = new int[max+1];
			String values = new String();
			
			values = in.next();
			char[] temp = values.toCharArray();
			
			for (int j=0; j<max+1; j++) {
				levels[j] = temp[j] - '0';
			}
			
			for (int j=0; j<max+1; j++) {
				
				if (levels[j] == 0 || cur < j) {
					if (cur < j) {
						sum++;
						cur++;
					}
				}
				cur += levels[j];
			}
			
			System.out.println("Case #" + i + ": " + sum);
		}
		
		in.close();

	}

}
