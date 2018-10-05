package methodEmbedding.Magic_Trick.S.LYD141;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MagicTrick {

	public static void main(String[] args) {
		BufferedReader reader;
		BufferedWriter writer;
		int N;
		int ans1, ans2;
		String[] P;
		String line;
		int[][] grid1 = new int[4][4];
		int[][] grid2 = new int[4][4];
		int[] row1 = new int[4];
		int[] row2 = new int[4];
		try {
			reader = new BufferedReader(new FileReader("A0.in"));
			writer = new BufferedWriter(new FileWriter("A0.out"));
			line = reader.readLine();
			N = Integer.parseInt(line);
			for (int n = 1; n <= N; n++) {
				line = reader.readLine();
				ans1 = Integer.parseInt(line);
				for (int i = 0; i < 4; i++) {
					line = reader.readLine();
					P = line.split(" ");
					for (int j = 0; j < 4; j++) {
						grid1[i][j] = Integer.parseInt(P[j]);
					}
				}
				row1 = grid1[ans1 - 1];
				
				line = reader.readLine();
				ans2 = Integer.parseInt(line);
				for (int i = 0; i < 4; i++) {
					line = reader.readLine();
					P = line.split(" ");
					for (int j = 0; j < 4; j++) {
						grid2[i][j] = Integer.parseInt(P[j]);
					}
				}
				row2 = grid2[ans2 - 1];
				
				int count = 0;
				int match = 0;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < 4; j++) {
						if (row1[i] == row2[j]) {
							count += 1;
							match = row1[i];
						}
					}
				}
				writer.append("Case #" + n + ": ");
				if (count == 1)
					writer.append(match + " ");
				else if (count == 0)
					writer.append("Volunteer cheated!");
				else
					writer.append("Bad magician!");
				writer.newLine();
			}
			reader.close();
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
