package methodEmbedding.Magic_Trick.S.LYD563;

import java.util.HashSet;
import java.util.Scanner;

public class ProblemA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testNo = input.nextInt()+1;
		for (int i = 1; i < testNo; i++) {
			int rowNo = input.nextInt();
			HashSet<Integer> cards = new HashSet<Integer>();
			for (int j = 1; j < 5; j++) {
				for (int k = 0; k < 4; k++) {
					int card = input.nextInt();
					if (rowNo == j) {
						//System.out.println(card + " is added");
						cards.add(card);
					}
				}
			}
			int rowNo2 = input.nextInt();
			int result = -1;
			for (int j = 1; j < 5; j++) {
				for (int k = 0; k < 4; k++) {
					int card = input.nextInt();
					if (rowNo2 == j) {
						//System.out.println(card + " is checked");
						if (cards.contains(card)) {
							//System.out.println("contains");
							if (result == -1) {
								result = card;
							} else {
								result = -2;
							}
						}
					}
				}
			}
			String msg = "";
			if (result == -2) {
				msg = "Bad magician!";
			}
			else if (result == -1) {
				msg = "Volunteer cheated!";
			}
			else {
				msg = String.valueOf(result);
			}
			System.out.println(String.format("Case #%d: %s", i, msg));
			//System.out.println(result);
		}

	}

}
