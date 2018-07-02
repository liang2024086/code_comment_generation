package methodEmbedding.Magic_Trick.S.LYD1876;

import java.util.*;
class Magic{
	public static void main( String args[] ){
		Scanner s = new Scanner( System.in );
		int t = s.nextInt();
		int num1, num2;
		int[][] cards1 = new int[4][4];
		int[][] cards2 = new int[4][4];
		int caseNumber = 1;
		while( t-- > 0 ){
			num1 = s.nextInt() - 1;
			for ( int i = 0; i < 4; i ++ ) {
				for ( int j = 0; j < 4; j ++ ) {
					cards1[i][j] = s.nextInt();
				}
			}
			num2 = s.nextInt() - 1;
			for ( int i = 0; i < 4; i ++ ) {
				for ( int j = 0; j < 4; j ++ ) {
					cards2[i][j] = s.nextInt();
				}
			}
			int count = 0;
			int number = 0;
			for ( int i = 0; i < 4; i ++ ) {
				for ( int j = 0; j < 4; j ++ ) {
					if ( cards1[num1][i] == cards2[num2][j] ) {
						count ++;
						number = cards1[num1][i];
					}
				}
			}
			if ( count == 1 ) {
				System.out.println("Case #" + caseNumber + ": " + number);
			}
			if ( count > 1 ) {
				System.out.println("Case #" + caseNumber + ": Bad magician!");				
			}
			if ( count == 0 ) {
				System.out.println("Case #" + caseNumber + ": Volunteer cheated!");
			}
			caseNumber ++;
		}
	}
}
