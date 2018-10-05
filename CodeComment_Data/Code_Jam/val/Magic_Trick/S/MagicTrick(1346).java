package methodEmbedding.Magic_Trick.S.LYD1148;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MagicTrick {

	public static void main(String[] args) throws IOException {
		int num_cases = 0;
		String[][] cards = new String[4][4];
		int[] first = new int[4];
		int[] second = new int[4];
		int volunteer_answer = 0;
		int magician_answer = 0;
		int prospect = 0;

		BufferedReader br = new BufferedReader(new FileReader("A-small-attempt0.in"));

		num_cases = Integer.parseInt(br.readLine());

		for (int i = 1; i <= num_cases; i++) {
			prospect = 0;

			System.out.print("Case #" + i + ": ");
			// First question
			volunteer_answer = Integer.parseInt(br.readLine());
			for (int j = 0; j < 4; j++)
				cards[j] = br.readLine().split(" ");

			for (int j = 0; j < 4; j++)
				first[j] = Integer.parseInt(cards[volunteer_answer - 1][j]);

			// Second question
			volunteer_answer = Integer.parseInt(br.readLine());
			for (int j = 0; j < 4; j++)
				cards[j] = br.readLine().split(" ");

			for (int j = 0; j < 4; j++)
				second[j] = Integer.parseInt(cards[volunteer_answer - 1][j]);

			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (first[j] == second[k]) {
						prospect++;
						magician_answer = first[j];
					}
				}
			}

			if (prospect == 1)
				System.out.println(magician_answer);
			else if (prospect > 1)
				System.out.println("Bad magician!");
			else
				System.out.println("Volunteer cheated!");
		}
		br.close();
	}
}
