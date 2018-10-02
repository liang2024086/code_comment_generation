package methodEmbedding.Standing_Ovation.S.LYD83;

import java.util.Scanner;

public class ProblemA {
	static Scanner s;
	public static void main(String args[]) throws Exception {
		int t;
		s = new Scanner(System.in);
		t = s.nextInt();
		for(int test=1;test<=t;test++) {
			int smax = s.nextInt();
			String si = s.next();
			int numFriends = 0;
			int current = 0;
			for(int i=0;i<=smax;i++) {
				current +=  Character.getNumericValue(si.charAt(i));
//				System.out.println("Current = "+current);
//				System.out.println("NumFriends = "+numFriends);
				if(current <= i) {
					numFriends++;
					current++;
				}
			}
			System.out.println("Case #"+test+": "+numFriends);
		}
	}
}
