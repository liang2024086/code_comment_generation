package methodEmbedding.Magic_Trick.S.LYD1415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicTrick {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int caseCount = Integer.parseInt(br.readLine());
			for (int c = 1; c < caseCount + 1; c++) {
				int firstRow = Integer.parseInt(br.readLine());
				int[][] firstGrid = new int[4][4];
				for (int i = 0; i < 4; i++) {
					String line = br.readLine();
					String[] nums = line.split(" ");
					for (int j = 0; j < nums.length; j++) {
						firstGrid[i][j] = Integer.parseInt(nums[j]);
					}
				}
				int secondRow = Integer.parseInt(br.readLine());
				int[][] secondGrid = new int[4][4];
				for (int i = 0; i < 4; i++) {
					String line = br.readLine();
					String[] nums = line.split(" ");
					for (int j = 0; j < nums.length; j++) {
						secondGrid[i][j] = Integer.parseInt(nums[j]);
					}
				}
				int count = 0;
				int num = 0;
				for (int i = 0; i < 4; i++) {
					int cur = firstGrid[firstRow - 1][i];
					for (int j = 0; j < 4; j++) {
						if (cur == secondGrid[secondRow - 1][j]) {
							count++;
							num = cur;
						}
					}
				}
				System.out.print("Case #" + c + ": ");
				switch (count) {
				case 0:
					System.out.println("Volunteer cheated!");
					break;
				case 1:
					System.out.println(num);
					break;
				default:
					System.out.println("Bad magician!");
					break;
				}
			}
		} catch (IOException e) {
		}
	}

}
