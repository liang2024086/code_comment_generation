package methodEmbedding.Standing_Ovation.S.LYD1710;

import java.util.Scanner;


public class StandingOvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		int numcase = 1;
		for (int i = 0; i < cases; i++) {
			int friends = 0;
			int total = 0;
			in.next();
			char[] dig = in.next().toCharArray();
			for (int j = 0; j < dig.length; j++) {
				if (total >= j) {
					total += Character.getNumericValue(dig[j]);
				} else {
					friends += j - total;
					total += Character.getNumericValue(dig[j]) + j - total;
				}
			}
			System.out.println("Case #"+numcase+": "+friends);
			numcase++;
		}
	}

}
