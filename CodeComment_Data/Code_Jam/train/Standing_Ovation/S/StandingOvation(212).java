package methodEmbedding.Standing_Ovation.S.LYD2141;

import java.util.Scanner;

public class StandingOvation {

	private static final Scanner sc = new Scanner(System.in);	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int T = sc.nextInt();

		for (int i = 0; i < T; i++){
			
			int N = sc.nextInt();						
			
			String str = sc.next();
			
			int total = 0, friends = 0;
			
			for (int j = 0; j <= N; j++){

				if (total + friends < j)
					friends += (j - total - friends);
				
				total += Character.getNumericValue(str.charAt(j));
			
			}
			System.out.println("Case #" + (i + 1) + ": " + friends);
		}
	}

}
