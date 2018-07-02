package methodEmbedding.Standing_Ovation.S.LYD707;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Integer t = input.nextInt();
		for (int testCase = 0; testCase < t; testCase++) {
			int sMax = input.nextInt();
			
			String s = input.next();
			int qtdStand = 0;
			int friendsInvited = 0;

			for( int i = 0; i < sMax + 1; i++ ) {
				Integer audience = new Integer( s.charAt( i ) + "" );

				if( i > qtdStand ) {
					int friendsToInvite = i - qtdStand;
					friendsInvited += friendsToInvite;
					
					qtdStand += audience + friendsToInvite;
				} else {
					qtdStand += audience;
				}
			}

			System.out.println( "Case #" + ( testCase + 1 ) + ": " + friendsInvited );
		}

		input.close();
	}
}
