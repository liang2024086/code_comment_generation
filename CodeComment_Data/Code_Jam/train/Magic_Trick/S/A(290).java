package methodEmbedding.Magic_Trick.S.LYD1146;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class A {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);

		File file = new File("Output_A.out");

		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		int t = s.nextInt();
		int gg = 1;

		int[] row1 = new int[4];
		int[] row2 = new int[4];

		while (t-- > 0) {
			int ans1 = s.nextInt();
			int[][] arr1 = new int[4][4];

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arr1[i][j] = s.nextInt();
					if (i == ans1-1)
						row1[j] = arr1[i][j];

				}
			}

			int ans2 = s.nextInt();
			int[][] arr2 = new int[4][4];

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					arr2[i][j] = s.nextInt();
					if (i == ans2-1)
						row2[j] = arr2[i][j];
				}
			}

			int flg = -1;
			int count = 0;
			String result = "";

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (row1[i] == row2[j]) {
						count++;
						result = row1[i] + "";
					}
				}
			}

			if (count == 0)
				result = "Volunteer cheated!";

			else if(count>1)
				result = "Bad magician!";
			
			
			System.out.printf("Case #%d: %s\n", gg++, result);
		}

		bw.close();
	}
}
