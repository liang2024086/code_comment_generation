package methodEmbedding.Magic_Trick.S.LYD2077;


import java.util.Scanner;

public class MagicTrick {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		for(int i = 1; i <= testCase; i++) {
			int match = 0, answer = 0;
			int solution1 = sc.nextInt();
			int[] deck = new int[4];
			for(int j = 1; j <= 4; j++) {
				for(int k = 1; k <= 4; k++) {
					if(j == solution1)
						deck[k - 1] = sc.nextInt();
					else
						sc.nextInt();
				}
			}
			int solution2 = sc.nextInt();
			for(int j = 1; j <= 4; j++) {
				for(int k = 1; k <= 4; k++) {
					if(j == solution2){
						int element = sc.nextInt();
						for(int l = 0; l < 4; l++) {
							if(element == deck[l]) {
								match++;
								answer = element;
								break;
							}
						}
					} else
						sc.nextInt();
				}
			}
			String answerString;
			if(match == 1)
				answerString = String.valueOf(answer);
			else if(match > 1)
				answerString = "Bad magician!";
			else
				answerString = "Volunteer cheated!";
			System.out.println("Case #" + i + ": " + answerString);
		}
		sc.close();
	}
}
