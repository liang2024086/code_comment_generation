package methodEmbedding.Magic_Trick.S.LYD523;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class MagicTrickMain {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new FileReader(args[0]));
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File(args[0].replace(".in", ".out"))));
		int numTestCases = Integer.parseInt(reader.readLine());
		for (int i = 0; i < numTestCases; i++) {
			int row1 = Integer.parseInt(reader.readLine());
			int[] cards1 = new int[4];
			for (int j = 0; j < 4; j++) {
				if (j == row1-1) {
					String[] numbers = reader.readLine().split(" ");
					for (int k = 0; k < 4; k++) {
						cards1[k] = Integer.parseInt(numbers[k]);
					}
				} else {
					reader.readLine();
				}
			}
			int row2 = Integer.parseInt(reader.readLine());
			Set<Integer> cards2 = new HashSet<Integer>();
			for (int j = 0; j < 4; j++) {
				if (j == row2-1) {
					String[] numbers = reader.readLine().split(" ");
					for (int k = 0; k < 4; k++) {
						cards2.add(Integer.parseInt(numbers[k]));
					}
				} else {
					reader.readLine();
				}
			}
			int numCards = 0;
			int theCard = 0;
			for (int card: cards1) {
				if (cards2.contains(card)) {
					numCards++;
					theCard = card;
				}
			}
			writer.write("Case #"+(i+1)+": ");
			if (numCards == 1) {
				writer.write(theCard+"\n");
			} else if (numCards > 1) {
				writer.write("Bad magician!\n");
			} else {
				writer.write("Volunteer cheated!\n");
			}
		}
		writer.close();
	}
}
