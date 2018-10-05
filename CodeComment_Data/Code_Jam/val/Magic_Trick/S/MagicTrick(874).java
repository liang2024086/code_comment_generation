package methodEmbedding.Magic_Trick.S.LYD477;

import java.util.Scanner;


class MagicTrick {

	public static void main(String[] args) {
		int testCases = 0;
		
		Scanner s = new Scanner(System.in);
		testCases = s.nextInt();
		
		for(int i = 1; i<=testCases; i++) {
			short choice1 = s.nextShort();
			choice1--;
			
			short[][] a = new short[4][4];
			short[][] b = new short[4][4];
			
			for(int index = 0; index<4; index++) {
				for(int subIndex = 0; subIndex<4; subIndex++) {
					a[index][subIndex] = s.nextShort();
				}
			}
			
			short choice2 = s.nextShort();
			choice2--;
			
			for(int index = 0; index<4; index++) {
				for(int subIndex = 0; subIndex<4; subIndex++) {
					b[index][subIndex] = s.nextShort();
				}
			}
			
			short guessCount = 0;
			short match = 0;
			for(int index = 0; index<4; index++) {
				for(int subIndex = 0; subIndex<4; subIndex++) {
					if(a[choice1][index] == b[choice2][subIndex]) {
						match = a[choice1][index];
						guessCount++;
					}
				}
			}
			
			if(guessCount == 1) {
				System.out.println("Case #" + i + ": " + match);
			} else if(guessCount > 1) {
				System.out.println("Case #" + i + ": Bad magician!");
			} else if(guessCount == 0) {
				System.out.println("Case #" + i + ": Volunteer cheated!");
			}
		}
		
		s.close();
	}

}
