package methodEmbedding.Magic_Trick.S.LYD490;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner;
		try {
			scanner = new Scanner(new File("D:/CodeJam/A-small-attempt0.in"));

			int[] cards1 = new int[16];
			int[] cards2 = new int[16];
			int n = scanner.nextInt();
			HashSet<Integer> set;
			for (int i = 0; i < n; i++) {
				set = new HashSet<>();
				int match = 0;
				int theCard = 0;
				int answer1 = scanner.nextInt() - 1;
				for (int j = 0; j < 16; j++) {
					cards1[j] = scanner.nextInt();
				}
				int answer2 = scanner.nextInt() - 1;
				for (int j = 0; j < 16; j++) {
					cards2[j] = scanner.nextInt();
				}
				for (int j = 0; j < 4; j++) {
					set.add(cards1[answer1 * 4 + j]);
				}
				for (int j = 0; j < 4; j++) {
					if (!set.add(cards2[answer2 * 4 + j])) {
						match++;
						theCard = cards2[answer2 * 4 + j];
					}
				}
				switch (match) {
				case 0:
					System.out.println("Case #" + (i + 1)
							+ ": Volunteer cheated!");
					break;
				case 1:
					System.out.println("Case #" + (i + 1) + ": " + theCard);
					break;
				default:
					System.out.println("Case #" + (i + 1) + ": Bad magician!");
					break;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
