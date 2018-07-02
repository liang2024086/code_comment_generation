package methodEmbedding.Magic_Trick.S.LYD1160;

import java.io.BufferedReader;
import java.io.FileReader;

public class Magician {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		int case_amount = Integer.parseInt(br.readLine());

		for (int i = 0; i < case_amount; i++) {

			int[][] rows = new int[2][4];
			for (int l = 0; l < 2; l++) {
				int row = Integer.parseInt(br.readLine());
				for (int j = 0; j < 4; j++) {
					if (j == row - 1) {
						String[] str = br.readLine().split("\\s");
						for (int k = 0; k < str.length; k++)
							rows[l][k] = Integer.parseInt(str[k]);
					} else
						br.readLine();
				}
			}

			int count = 0;
			int number = 0;

			for (int j = 0; j < 4; j++) {
				for (int k = 0; k < 4; k++) {
					if (rows[0][j] == rows[1][k]) {
						count++;
						number = rows[0][j];
						break;
					}
				}
			}

			if (count == 0)
				System.out.println("Case #" + (i + 1) + ": Volunteer cheated!");
			else if (count == 1)
				System.out.println("Case #" + (i + 1) + ": " + number);
			else
				System.out.println("Case #" + (i + 1) + ": Bad magician!");

		}
		
		br.close();

	}
}
