package methodEmbedding.Standing_Ovation.S.LYD355;


import java.util.Scanner;

public class StadingOvation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for( int c = 1; c <= T; ++c) {
			int smax = input.nextInt();
			String s = input.next();
			int total = Character.getNumericValue(s.charAt(0));
			int invite = 0;
			int i = 1;
			for( ; i <= smax; ++i) {
				int si = Character.getNumericValue(s.charAt(i));
				if( i > total ) {
					invite += (i - total); 
					total += (i - total); 
				}
				total += si;
			}
			
			System.out.println("Case #" + c + ": " + invite);
		}
		input.close();
	}
	
}
