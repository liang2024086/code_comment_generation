package methodEmbedding.Standing_Ovation.S.LYD1192;

import java.util.Scanner;

public class StandingOvation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Start!");
		
		int T = 0;		// The number of test cases
		int Smax = 0;	// The maximum shyness level
		String audiences = null;
		
		T = scanner.nextInt();
		
		for (int x = 1 ; x <= T ; x++) {
			int y = 0;	// The minimum number of friends you must invite.
			
			Smax = scanner.nextInt();
			audiences = scanner.next();
			
			int standing = 0;
			for (int i = 0 ; i < (Smax + 1) ; i++) {
//				System.out.println(audiences.substring(i, i + 1));
				int num = Integer.parseInt(audiences.substring(i, i + 1));
				
				if (num > 0) {
					if ((standing + y) < i) {
						y += (i - standing - y);
					}
					standing += num;
				}
				
//				System.out.print(i + " = " + audiences.charAt(i) + ", ");
			}
//			System.out.println();
			
//			System.out.println(x + ":" + audiences);
			System.out.println("Case #" + x + ": " + y);
		}
		
		System.out.println("Finish!");
	}

}
