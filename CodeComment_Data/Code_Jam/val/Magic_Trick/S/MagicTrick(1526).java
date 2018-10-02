package methodEmbedding.Magic_Trick.S.LYD718;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MagicTrick {
	public static void main(String[] args) {

		try {

			// TODO: move file open stuff into its own method and just pass a param to it.
			FileReader fr;
			BufferedReader br;
			File file = new File(args[0]);

			fr = new FileReader(file);
			br = new BufferedReader(fr);

			int numOfRounds;
			numOfRounds = Integer.parseInt(br.readLine().trim());

			ArrayList<Integer> set1 = new ArrayList<Integer>(4);
			ArrayList<Integer> set2 = new ArrayList<Integer>(4);
			int answerRow;
			int counter = 0;
			int cardNumber = 0;

			String nextLine;
			String[] row;

			for (int i = 0; i < numOfRounds; i++) {
				
				set1.clear();
				set2.clear();
				counter = 0;

				answerRow = Integer.parseInt(br.readLine().trim());
				for (int j = 1; j <= 4; j++) {
					nextLine = br.readLine();
					if (j == answerRow) {
						row = nextLine.split(" ");

						for (int k = 0; k < 4; k++) {
							set1.add(Integer.parseInt(row[k]));
						}
					}
				}

				answerRow = Integer.parseInt(br.readLine().trim());
				for (int j = 1; j <= 4; j++) {
					nextLine = br.readLine();
					if (j == answerRow) {
						row = nextLine.split(" ");

						for (int k = 0; k < 4; k++) {
							set2.add(Integer.parseInt(row[k]));
						}
					}
				}

				for (int j = 0; j < 4; j++) {
					if (set2.contains(set1.get(j))) {
						counter++;
						cardNumber = set1.get(j);
					}
				}

				if (counter == 0) {
					System.out.println("Case #" + (i + 1)
							+ ": Volunteer cheated!");
				} else if (counter == 1) {
					System.out.println("Case #" + (i + 1) + ": " + cardNumber);
				} else {
					System.out.println("Case #" + (i + 1) + ": Bad magician!");
				}
			}

			br.close();
		} catch (FileNotFoundException e) {
			// File not found
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
